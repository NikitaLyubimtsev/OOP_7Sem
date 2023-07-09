package meteo;

class MeteoStore {
    // сохранение данных в базу
    boolean save(MeteoSensor meteoSensor) {
        System.out.format("Saving data from sensor [%d] at %s%n temperature - %f ; humidity - %f ; pressure - %f \n\r",
				meteoSensor.getId(),
				meteoSensor.getDateTime(),
				meteoSensor.getTemperature(),
				meteoSensor.getHumidity(),
				meteoSensor.getPressure());
        return true;
    }

    boolean save(SensorTemperature sensorTemperature) {
        System.out.format("Saving data from sensor [%d] at %s-%s-%s%n temperature - %f ; humidity - non ; pressure - non \n\r",
                sensorTemperature.identifier(),
                sensorTemperature.year(),
                sensorTemperature.day(),
                sensorTemperature.second(),
                sensorTemperature.temperature()
        );
        return true;
    }
}