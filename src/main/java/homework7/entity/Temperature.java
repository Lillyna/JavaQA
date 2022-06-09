package homework7.entity;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class Temperature {
    private Metric metricObject;
    private Imperial imperialObject;

    @JsonCreator
    public Temperature(@JsonProperty("Metric") Metric metricObject,
                       @JsonProperty("Imperial") Imperial imperialObject) {
        this.metricObject = metricObject;
        this.imperialObject = imperialObject;
    }

    // Getter Methods

    public Metric getMetric() {
        return metricObject;
    }

    public Imperial getImperial() {
        return imperialObject;
    }

    // Setter Methods

    public void setMetric(Metric MetricObject) {
        this.metricObject = MetricObject;
    }

    public void setImperial(Imperial ImperialObject) {
        this.imperialObject = ImperialObject;
    }
}
