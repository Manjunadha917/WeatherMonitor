package config;



import java.util.Arrays;
import java.util.List;

public class AppConfig {
    public static final String API_KEY = "ebbea9f55061fa621fa355af9709b9c5";  // Replace with actual key
    public static final String BASE_URL = "https://api.openweathermap.org/data/2.5/weather";
    public static final List<String> CITIES = Arrays.asList("Delhi", "Mumbai", "Chennai", "Bangalore", "Kolkata", "Hyderabad");
    public static final int FETCH_INTERVAL = 300000; // 5 minutes in milliseconds
    public static final double ALERT_THRESHOLD = 35.0; // Alert if temp > 35°C

    public static String getCityUrl(String city) {
        return BASE_URL + "?q=" + city + "&appid=" + API_KEY;
    }
}

