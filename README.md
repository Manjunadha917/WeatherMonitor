Weather Monitoring System using OpenWeatherMap API
Overview
This project implements a real-time weather monitoring system that fetches weather data from the OpenWeatherMap API. The system continuously retrieves and processes weather conditions for major cities in India. It provides summarized insights using roll-ups and aggregates, while also generating alerts when specific weather thresholds are breached.

Features
Real-time Weather Data: Fetches weather data every 5 minutes for cities like Delhi, Mumbai, Chennai, Bangalore, Kolkata, and Hyderabad.
Data Aggregation:
Daily summary of weather, including:
Average temperature
Maximum and minimum temperatures
Dominant weather condition
Temperature Conversion: Supports conversion from Kelvin to Celsius.
Threshold Alerts: Generates alerts if temperature exceeds a defined threshold (35°C by default).
Configurable API Calls: Users can configure the API call frequency and city list.
Error Handling: Handles API response errors, including invalid responses and API rate limits.
Technologies Used
Programming Language: Java


Libraries:
org.json (for JSON parsing)
Apache HttpClient (for HTTP requests)
OpenWeatherMap API: Retrieves weather data


Build Tool: Eclipse IDE (Manually managed dependencies via JARs)


Project Structure
bash
Copy code
src
│
├── app
│   └── WeatherMonitorApp.java        # Main application to start the weather monitoring service
│
├── config
│   └── AppConfig.java                # Configuration file containing API keys and settings
│
├── model
│   └── WeatherData.java              # POJO to hold weather data
│
├── service
│   └── WeatherService.java           # Service to fetch weather data from API
│
└── util
    └── HttpUtil.java                 # Utility class for handling HTTP requests
Installation and Setup
Prerequisites:

Java Development Kit (JDK) 8 or later.
Eclipse IDE (or any preferred IDE).
A valid API key from OpenWeatherMap.
Clone the Repository:

bash
Copy code
git clone <repository-url>
cd <repository-folder>
Add Dependencies:

Download the following JAR files:
org.json JAR
Add them to your project:
Eclipse: Right-click on the project -> Build Path -> Add External JARs.
Configure API Key and Settings:

Open config/AppConfig.java.
Replace your_openweather_api_key with your actual API key.
Run the Application:

Open WeatherMonitorApp.java in your IDE.
Run the program to start monitoring weather updates.
Usage
Weather Data Fetching:

The system fetches weather data every 5 minutes (configurable in AppConfig.java).
For each city, it prints the current temperature, feels-like temperature, and weather conditions.
Threshold Alerts:

If the temperature exceeds 35°C for any city, the system triggers an alert on the console.
Daily Summary:

Summarizes daily temperature metrics (average, max, min) and logs the dominant weather condition.
Test Cases
System Setup:

Verify the system connects to the OpenWeatherMap API using a valid API key.
Data Retrieval:

Simulate API calls at different intervals and verify that weather data is correctly retrieved and parsed.
Temperature Conversion:

Test the conversion from Kelvin to Celsius.
Threshold Alerts:

Define threshold limits and simulate temperature breaches to trigger alerts.
Error Handling:

Test with invalid API responses (e.g., rate limit exceeded) and verify that the system handles these cases gracefully.
Error Handling and Troubleshooting
Invalid API Key Error:

Make sure the API key is correctly configured in AppConfig.java.
Empty or Malformed JSON Response:

If the response is invalid, the system logs the error and skips processing for that city.
API Rate Limits:

Add a delay between API calls if the service returns a "too many requests" error.
Future Enhancements (Bonus Features)
Support for Additional Weather Metrics:

Include humidity, wind speed, and pressure in the summary.
Email Alerts:

Send email notifications when temperature thresholds are breached.
Weather Forecasts:

Retrieve 5-day forecasts and display summaries based on predicted conditions.
UI Visualization:

Add a web-based interface to visualize weather trends and alerts.
