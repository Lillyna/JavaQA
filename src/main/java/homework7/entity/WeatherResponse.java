package homework7.entity;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class WeatherResponse {

    private String localObservationDateTime;
    private float epochTime;
    private String weatherText;
    private float weatherIcon;
    private boolean hasPrecipitation;
    private String precipitationType;
    private boolean isDayTime;
    private Temperature temperatureObject;
    private String mobileLink;
    private String link;

    @JsonCreator
    public WeatherResponse(@JsonProperty("LocalObservationDateTime") String localObservationDateTime,
                           @JsonProperty("EpochTime") float epochTime,
                           @JsonProperty("WeatherText") String weatherText,
                           @JsonProperty("WeatherIcon") float weatherIcon,
                           @JsonProperty("HasPrecipitation") boolean hasPrecipitation,
                           @JsonProperty("PrecipitationType") String precipitationType,
                           @JsonProperty("IsDayTime") boolean isDayTime,
                           @JsonProperty("Temperature") Temperature temperatureObject,
                           @JsonProperty("MobileLink") String mobileLink,
                           @JsonProperty("Link") String link) {
        this.localObservationDateTime = localObservationDateTime;
        this.epochTime = epochTime;
        this.weatherText = weatherText;
        this.weatherIcon = weatherIcon;
        this.hasPrecipitation = hasPrecipitation;
        this.precipitationType = precipitationType;
        this.isDayTime = isDayTime;
        this.temperatureObject = temperatureObject;
        this.mobileLink = mobileLink;
        this.link = link;
    }

    public String showWeather() {
        return "Температура воздуха: " + temperatureObject.getMetric().getValue() + " " +
                temperatureObject.getMetric().getUnit() + ", " +
                weatherText;
    }

// Getter Methods

    public String getLocalObservationDateTime() {
        return localObservationDateTime;
    }

    public float getEpochTime() {
        return epochTime;
    }

    public String getWeatherText() {
        return weatherText;
    }

    public float getWeatherIcon() {
        return weatherIcon;
    }

    public boolean getHasPrecipitation() {
        return hasPrecipitation;
    }

    public String getPrecipitationType() {
        return precipitationType;
    }

    public boolean getIsDayTime() {
        return isDayTime;
    }

    public Temperature getTemperature() {
        return temperatureObject;
    }

    public String getMobileLink() {
        return mobileLink;
    }

    public String getLink() {
        return link;
    }

// Setter Methods

    public void setLocalObservationDateTime(String LocalObservationDateTime) {
        this.localObservationDateTime = LocalObservationDateTime;
    }

    public void setEpochTime(float EpochTime) {
        this.epochTime = EpochTime;
    }

    public void setWeatherText(String WeatherText) {
        this.weatherText = WeatherText;
    }

    public void setWeatherIcon(float WeatherIcon) {
        this.weatherIcon = WeatherIcon;
    }

    public void setHasPrecipitation(boolean HasPrecipitation) {
        this.hasPrecipitation = HasPrecipitation;
    }

    public void setPrecipitationType(String PrecipitationType) {
        this.precipitationType = PrecipitationType;
    }

    public void setIsDayTime(boolean IsDayTime) {
        this.isDayTime = IsDayTime;
    }

    public void setTemperature(Temperature TemperatureObject) {
        this.temperatureObject = TemperatureObject;
    }

    public void setMobileLink(String MobileLink) {
        this.mobileLink = MobileLink;
    }

    public void setLink(String Link) {
        this.link = Link;
    }
}

