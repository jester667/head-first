package com.example.headfirst.observer.stepone;

public class WeatherData {
    private float temperature;
    private float humidity;
    private float pressure;

    private WeatherData currentConditionsDisplay;
    private WeatherData statisticsDisplay;
    private WeatherData forecastDisplay;


    public void update(float temperature, float humidity, float pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
    }

    public float getTemperature() {
        return temperature;
    }

    public float getHumidity() {
        return humidity;
    }

    public float getPressure() {
        return pressure;
    }

    public void measurementsChanged() {
        float temp = getTemperature();
        float humidity = getHumidity();
        float pressure = getPressure();

        currentConditionsDisplay.update(temp, humidity, pressure);
        statisticsDisplay.update(temp, humidity, pressure);
        forecastDisplay.update(temp, humidity, pressure);

        
    }
}
