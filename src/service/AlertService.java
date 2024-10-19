package service;

import model.WeatherData;

import java.util.List;

import config.AppConfig;

public class AlertService {

    public void checkAlerts(List<WeatherData> dataList) {
        for (WeatherData data : dataList) {
            if (data.getTemp() > AppConfig.ALERT_THRESHOLD) {
                System.out.println("ALERT: Temperature exceeded threshold in " + data.getCity() + " (" + data.getTemp() + "°C)");
            }
        }
    }
}
