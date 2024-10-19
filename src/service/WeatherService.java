package service;

import config.AppConfig;
import model.WeatherData;
import util.HttpUtil;
import org.json.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class WeatherService {

    public List<WeatherData> fetchWeatherData() throws Exception {
        List<WeatherData> weatherDataList = new ArrayList<>();

        for (String city : AppConfig.CITIES) {
            try {
                String response = HttpUtil.getWeatherData(AppConfig.getCityUrl(city));
                JSONObject json = new JSONObject(response);

                String mainCondition = json.getJSONArray("weather").getJSONObject(0).getString("main");
                double temp = json.getJSONObject("main").getDouble("temp");
                double feelsLike = json.getJSONObject("main").getDouble("feels_like");
                long timestamp = json.getLong("dt");

                weatherDataList.add(new WeatherData(city, mainCondition, temp, feelsLike, timestamp));
            } catch (Exception e) {
                System.err.println("Error fetching data for city: " + city + ". " + e.getMessage());
            }
        }

        return weatherDataList;
    }
}
