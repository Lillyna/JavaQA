package homework7.entity;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Day {
    final float icon;
    private final String iconPhrase;
    final boolean hasPrecipitation;

    @JsonCreator
    public Day(@JsonProperty("Icon") float icon,
               @JsonProperty("IconPhrase") String iconPhrase,
               @JsonProperty("HasPrecipitation") boolean hasPrecipitation) {
        this.icon = icon;
        this.iconPhrase = iconPhrase;
        this.hasPrecipitation = hasPrecipitation;
    }

    @Override
    public String toString() {
        return " " + iconPhrase;
    }
}
