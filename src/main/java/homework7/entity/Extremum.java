package homework7.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Extremum {
    private final float value;
    private final String unit;
    float unitType;

    public Extremum(@JsonProperty("Value") float value,
                   @JsonProperty("Unit") String unit,
                   @JsonProperty("UnitType") float unitType) {
        this.value = value;
        this.unit = unit;
        this.unitType = unitType;
    }

    @Override
    public String toString() {
        return " " + value + " " + unit;
    }

    public float getValue() {
        return value;
    }

    public String getUnit() {
        return unit;
    }

    public float getUnitType() {
        return unitType;
    }
}
