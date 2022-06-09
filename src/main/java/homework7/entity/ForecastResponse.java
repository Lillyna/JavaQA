package homework7.entity;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonRootName;
import homework7.ApplicationGlobalState;

import java.util.ArrayList;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonRootName(value = "DailyForecasts")
public class ForecastResponse {
    private final String date;
    final float epochDate;
    ForecastTemperature forecastTemperature;
    Day dayObject;
    Day nightObject;
    ArrayList< Object > sources = new ArrayList < Object > ();
    final String mobileLink;
    final String link;

    @JsonCreator
    public ForecastResponse(@JsonProperty("Date") String date,
                            @JsonProperty("EpochDate")float epochDate,
                            @JsonProperty("Temperature") ForecastTemperature forecastTemperature,
                            @JsonProperty("Day") Day dayObject,
                            @JsonProperty("Night") Day nightObject,
                            @JsonProperty("Sources") ArrayList<Object> sources,
                            @JsonProperty("MobileLink") String mobileLink,
                            @JsonProperty("Link") String link) {
        this.date = date;
        this.epochDate = epochDate;
        this.forecastTemperature = forecastTemperature;
        this.dayObject = dayObject;
        this.nightObject = nightObject;
        this.sources = sources;
        this.mobileLink = mobileLink;
        this.link = link;
    }

    public String showForecast() {
        return "В городе " + ApplicationGlobalState.getInstance().getSelectedCity() +
                " на дату " + date + " ожидается: " +
                "\n " + forecastTemperature +
                "\n Днём: " + dayObject +
                ",\n Ночью: " + nightObject;
    }

    public String getDate() {
        return date;
    }

    public float getEpochDate() {
        return epochDate;
    }

    public ForecastTemperature getForecastTemperature() {
        return forecastTemperature;
    }

    public Day getDayObject() {
        return dayObject;
    }

    public Day getNightObject() {
        return nightObject;
    }

    public ArrayList<Object> getSources() {
        return sources;
    }

    public String getMobileLink() {
        return mobileLink;
    }

    public String getLink() {
        return link;
    }
}


