<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
   
</head>
<body>
<h1>
    <h1>Weather Monitoring System using OpenWeatherMap API 🌦</h1>
<p></p>
    <p><strong>Real-time weather data monitoring for Indian metro cities, featuring temperature conversion, alerts, and summaries.</strong></p>
<section></section>
    <section>
        <h2>📋 Overview</h2>
        <p>This project implements a real-time weather monitoring system using the OpenWeatherMap API. It fetches weather data for major cities in India every 5 minutes and provides real-time weather insights, daily summaries, and alerts for weather threshold breaches.</p>
<h2></h2>
        <h2>✨ Features</h2>
        <ul>
            <li><strong>Real-time Weather Data:</strong> Fetches data every 5 minutes for cities like Delhi, Mumbai, Chennai, Bangalore, Kolkata, and Hyderabad.</li>
            <li><strong>Data Aggregation:</strong> Summarizes daily weather (average, max, min temperatures).</li>
            <li><strong>Temperature Conversion:</strong> Converts Kelvin to Celsius for easy readability.</li>
            <li><strong>Threshold Alerts:</strong> Alerts triggered if temperature exceeds 35°C (default).</li>
            <li><strong>Configurable Settings:</strong> API call frequency and city list are configurable.</li>
            <li><strong>Error Handling:</strong> Robust handling for API errors and rate limits.</li>
        </ul>
<h2></h2>
        <h2>🛠 Technologies Used</h2>
        <ul>
            <li><strong>Programming Language:</strong> Java</li>
            <li><strong>Libraries:</strong> org.json (for JSON parsing), Apache HttpClient (for HTTP requests)</li>
            <li><strong>API:</strong> OpenWeatherMap API</li>
            <li><strong>Build Tool:</strong> Eclipse IDE (with manual JAR dependency management)</li>
        </ul>
<h2></h2>
        <h2>🗂 Project Structure</h2>
        <pre><code>src
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
        </code></pre>
<h2></h2>
        <h2>🔧 Installation and Setup</h2>
<h2></h2>
        <h3>Prerequisites</h3>
        <ul>
            <li>Java Development Kit (JDK) 8 or later.</li>
            <li>Eclipse IDE (or any preferred IDE).</li>
            <li>A valid API key from OpenWeatherMap.</li>
        </ul>
        <h3>Steps</h3>
        <ol>
            <li><strong>Clone the Repository:</strong></li>
            <pre><code>git clone &lt;repository-url&gt;
cd &lt;repository-folder&gt;
            </code></pre>
            <li><strong>Add Dependencies:</strong> Download <code>org.json</code> JAR file and add it to your project.</li>
            <li><strong>Configure API Key:</strong> Open <code>config/AppConfig.java</code> and replace <code>your_openweather_api_key</code> with your actual API key.</li>
            <li><strong>Run the Application:</strong> Open <code>WeatherMonitorApp.java</code> in your IDE and run the program to start monitoring weather updates.</li>
        </ol>
        <h2>⚙️ Usage</h2>
        <ul>
            <li><strong>Weather Data Fetching:</strong> Fetches data every 5 minutes (configurable in <code>AppConfig.java</code>).</li>
            <li><strong>Threshold Alerts:</strong> Alerts triggered in the console when temperature exceeds 35°C.</li>
            <li><strong>Daily Summary:</strong> Logs average, maximum, and minimum temperatures with dominant weather condition.</li>
        </ul>
        <h2>🧪 Test Cases</h2>
        <ul>
            <li><strong>System Setup:</strong> Verify connection to OpenWeatherMap API with a valid API key.</li>
            <li><strong>Data Retrieval:</strong> Test API calls and validate correct parsing of weather data.</li>
            <li><strong>Temperature Conversion:</strong> Test Kelvin to Celsius conversion.</li>
            <li><strong>Threshold Alerts:</strong> Simulate temperature breaches and check for alerts.</li>
            <li><strong>Error Handling:</strong> Test invalid API responses and rate limit errors.</li>
        </ul>
        <h2>🚨 Error Handling and Troubleshooting</h2>
        <ul>
            <li><strong>Invalid API Key:</strong> Ensure the key is correct in <code>AppConfig.java</code>.</li>
            <li><strong>Malformed JSON Response:</strong> Logs error and skips processing.</li>
            <li><strong>API Rate Limits:</strong> Add delays between API calls to avoid "too many requests" errors.</li>
        </ul>
        <h2>🌟 Future Enhancements</h2>
        <ul>
            <li>Add humidity, wind speed, and pressure to summaries.</li>
            <li>Implement email notifications for temperature breaches.</li>
            <li>Integrate 5-day weather forecasts.</li>
            <li>Develop a web-based UI to visualize weather trends and alerts.</li>
        </ul>
        <h2>📜 License</h2>
        <p>This project is licensed under the MIT License. See the <a href="#">LICENSE</a> file for more details.</p>
    </section>
    <div class="footer">
        <p>Weather Monitoring System © 2024</p>
    </div>

</body>
</html>
