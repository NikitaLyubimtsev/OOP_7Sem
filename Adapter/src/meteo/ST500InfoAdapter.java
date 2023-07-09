package meteo;

import java.time.LocalDateTime;

public class ST500InfoAdapter implements MeteoSensor {

    private final SensorTemperature sensor;
    public ST500InfoAdapter(ST500Info sensor) {
        this.sensor = sensor.getData();
    }

    @Override
    public int getId() {
        return sensor.identifier();
    }

    @Override
    public Float getTemperature() {
        return sensor.temperature();
    }

    @Override
    public Float getHumidity() {
        return null;
    }

    @Override
    public Float getPressure() {
        return null;
    }

    @Override
    public LocalDateTime getDateTime() {
        LocalDateTime data = LocalDateTime.of(sensor.year(), 1, 1, 0, 0);
        data = data.plusDays(sensor.day());
        data = data.plusSeconds(sensor.second());
        return data;
    }
}
