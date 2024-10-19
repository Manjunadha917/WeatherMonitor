package app;

import service.WeatherService;
import service.WeatherAggregator;
import service.AlertService;
import model.WeatherData;

import java.util.List;
import java.util.Map;
import java.util.Timer;
import java.util.TimerTask;

public class WeatherMonitorApp {

    public static void main(String[] args) {
        WeatherService weatherService = new WeatherService();
        WeatherAggregator aggregator = new WeatherAggregator();
        AlertService alertService = new AlertService();

        Timer timer = new Timer();
        timer.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                try {
                    List<WeatherData> weatherData = weatherService.fetchWeatherData();
                    Map<String, List<WeatherData>> groupedData = aggregator.groupByCity(weatherData);

                    for (Map.Entry<String, List<WeatherData>> entry : groupedData.entrySet()) {
                        System.out.println("City: " + entry.getKey());
                        aggregator.calculateDailySummary(entry.getValue());
                        alertService.checkAlerts(entry.getValue());
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        }, 0, config.AppConfig.FETCH_INTERVAL);
        System.out.println("Weather monitoring started. Fetching data every 5 minutes...");
    
    }
}
