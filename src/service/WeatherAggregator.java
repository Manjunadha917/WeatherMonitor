package service;


import model.WeatherData;

import java.util.*;
import java.util.stream.Collectors;

public class WeatherAggregator {

    public Map<String, List<WeatherData>> groupByCity(List<WeatherData> dataList) {
        return dataList.stream().collect(Collectors.groupingBy(WeatherData::getCity));
    }

    public void calculateDailySummary(List<WeatherData> dataList) {
        double avgTemp = dataList.stream().mapToDouble(WeatherData::getTemp).average().orElse(0.0);
        double maxTemp = dataList.stream().mapToDouble(WeatherData::getTemp).max().orElse(0.0);
        double minTemp = dataList.stream().mapToDouble(WeatherData::getTemp).min().orElse(0.0);

        String dominantCondition = dataList.stream()
                .collect(Collectors.groupingBy(WeatherData::getMainCondition, Collectors.counting()))
                .entrySet().stream().max(Map.Entry.comparingByValue()).get().getKey();

        System.out.println("Daily Summary:");
        System.out.println("Average Temp: " + avgTemp);
        System.out.println("Max Temp: " + maxTemp);
        System.out.println("Min Temp: " + minTemp);
        System.out.println("Dominant Condition: " + dominantCondition);
    }
}
