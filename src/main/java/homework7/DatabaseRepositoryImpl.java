package homework7;

import homework7.dto.WeatherData;

import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DatabaseRepositoryImpl implements DatabaseRepository {
    static {
        try {
            Class.forName("org.sqlite.JDBC");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    String filename = null;
    String createTableQuery = "CREATE TABLE IF NOT EXISTS weather (\n" +
            "id INTEGER PRIMARY KEY AUTOINCREMENT,\n" +
            "city TEXT NOT NULL,\n" +
            "date_time TEXT NOT NULL,\n" +
            "weather_text TEXT NOT NULL,\n" +
            "temperature REAL NOT NULL\n" +
            ");";
    String insertWeatherQuery = "INSERT INTO weather (city, date_time, weather_text, temperature) VALUES (?,?,?,?)";

    public DatabaseRepositoryImpl() {
        filename = ApplicationGlobalState.getInstance().getDbFileName();
        try {
            getConnection();
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            closeConnection();
        }
        createTableIfNotExists();
    }

    private Connection getConnection() throws SQLException {
        Connection connection = DriverManager.getConnection("jdbc:sqlite:" + filename);
        return connection;
    }

    private void createTableIfNotExists() {
        try (Connection connection = getConnection()) {
            connection.createStatement().execute(createTableQuery);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    @Override
    public boolean saveWeatherData(WeatherData weatherData) throws SQLException {
        try (Connection connection = getConnection();
             PreparedStatement saveWeather = connection.prepareStatement(insertWeatherQuery)) {
            saveWeather.setString(1, weatherData.getCity());
            saveWeather.setString(2, weatherData.getLocalDate());
            saveWeather.setString(3, weatherData.getText());
            saveWeather.setDouble(4, weatherData.getTemperature());
            return saveWeather.execute();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        throw new SQLException("Failure on saving weather object");
    }

    @Override
    public List<WeatherData> getAllSavedData() {
        List<WeatherData> weatherDataAll = new ArrayList<>();
        try (Connection connection = getConnection()) {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM weather");
            while (resultSet.next()) {
                WeatherData weatherData = new WeatherData(
                        resultSet.getString(2),
                        resultSet.getString(3),
                        resultSet.getString(4),
                        resultSet.getDouble(5));
                weatherDataAll.add(weatherData);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return  weatherDataAll;
    }

    @Override
    public void closeConnection(){
        try{
            getConnection().close();
        } catch (SQLException e){
            e.printStackTrace();
        }
    }
}
