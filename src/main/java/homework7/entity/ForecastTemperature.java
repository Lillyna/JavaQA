package homework7.entity;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ForecastTemperature {
    Extremum minimumObject;
    Extremum maximumObject;

    @JsonCreator
    public ForecastTemperature(@JsonProperty("Minimum") Extremum minimumObject,
                               @JsonProperty("Maximum") Extremum maximumObject) {
        this.minimumObject = minimumObject;
        this.maximumObject = maximumObject;
    }

    @Override
    public String toString() {
        return "Минимальная температура: " + minimumObject +
                ", Максимальная температура: " + maximumObject ;
    }
}
