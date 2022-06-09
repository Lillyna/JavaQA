package homework7.entity;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Imperial {
    private float value;
    private String unit;
    private float unitType;

    @JsonCreator
    public Imperial(@JsonProperty("Value") float value,
                    @JsonProperty("Unit") String unit,
                    @JsonProperty("UnitType") float unitType) {
        this.value = value;
        this.unit = unit;
        this.unitType = unitType;
    }

    // Getter Methods

    public float getValue() {
        return value;
    }

    public String getUnit() {
        return unit;
    }

    public float getUnitType() {
        return unitType;
    }

    // Setter Methods

    public void setValue(float Value) {
        this.value = Value;
    }

    public void setUnit(String Unit) {
        this.unit = Unit;
    }

    public void setUnitType(float UnitType) {
        this.unitType = UnitType;
    }
}
