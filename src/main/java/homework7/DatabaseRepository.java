package homework7;

import homework7.dto.WeatherData;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public interface DatabaseRepository {
    boolean saveWeatherData(WeatherData weatherData) throws SQLException;
    void closeConnection();

    List<WeatherData> getAllSavedData() throws IOException;
}
