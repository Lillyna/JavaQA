package homework7;

import homework7.enums.Periods;

import java.io.IOException;

public interface WeatherProvider {

    void getWeather(Periods period) throws IOException;
    void getSavedData();
}
