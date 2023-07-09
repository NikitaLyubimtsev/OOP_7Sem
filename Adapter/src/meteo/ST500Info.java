package meteo;

import java.time.*;

class ST500Info implements SensorTemperature {
    public SensorTemperature getData() {
        return new SensorTemperature() {
            public int identifier() {
                return 1;
            }

            public Float temperature() {
                return 22.0F;
            }

            public int year() {
                return LocalDateTime.now().getYear();
            }

            public int day() {
                return LocalDateTime.now().getDayOfYear();
            }

            public int second() {
                LocalDateTime now = LocalDateTime.now();
                return now.getHour() * 3600 + now.getMinute() * 60 + now.getSecond();
            }
        };

    }


    @Override
    public int identifier() {
        return 0;
    }

    @Override
    public Float temperature() {
        return 22.0F;
    }

    @Override
    public int year() {
        return 0;
    }

    @Override
    public int day() {
        return 0;
    }

    @Override
    public int second() {
        return 0;
    }
}