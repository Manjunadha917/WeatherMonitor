package model;

public class WeatherData {
    private String city;
    private String mainCondition;
    private double temp;
    private double feelsLike;
    private long timestamp;

    public WeatherData(String city, String mainCondition, double temp, double feelsLike, long timestamp) {
        this.city = city;
        this.mainCondition = mainCondition;
        this.temp = temp;
        this.feelsLike = feelsLike;
        this.timestamp = timestamp;
    }

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getMainCondition() {
		return mainCondition;
	}

	public void setMainCondition(String mainCondition) {
		this.mainCondition = mainCondition;
	}

	public double getTemp() {
		return temp;
	}

	public void setTemp(double temp) {
		this.temp = temp;
	}

	public double getFeelsLike() {
		return feelsLike;
	}

	public void setFeelsLike(double feelsLike) {
		this.feelsLike = feelsLike;
	}

	public long getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(long timestamp) {
		this.timestamp = timestamp;
	}

    
}
