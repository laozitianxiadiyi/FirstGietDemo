package pojo;

public class quality {
	private int id;
	private int district_id;
	private String monitor_time;
	private int pm10;
	private int pm25;
	private String monitoring_station;
	private String last_modify_time;
	
	public quality() {
		super();
	}
	public quality(int id, int district_id, String monitor_time, int pm10,
			int pm25, String monitoring_station, String last_modify_time) {
		super();
		this.id = id;
		this.district_id = district_id;
		this.monitor_time = monitor_time;
		this.pm10 = pm10;
		this.pm25 = pm25;
		this.monitoring_station = monitoring_station;
		this.last_modify_time = last_modify_time;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getDistrict_id() {
		return district_id;
	}
	public void setDistrict_id(int district_id) {
		this.district_id = district_id;
	}
	public String getMonitor_time() {
		return monitor_time;
	}
	public void setMonitor_time(String monitor_time) {
		this.monitor_time = monitor_time;
	}
	public int getPm10() {
		return pm10;
	}
	public void setPm10(int pm10) {
		this.pm10 = pm10;
	}
	public int getPm25() {
		return pm25;
	}
	public void setPm25(int pm25) {
		this.pm25 = pm25;
	}
	public String getMonitoring_station() {
		return monitoring_station;
	}
	public void setMonitoring_station(String monitoring_station) {
		this.monitoring_station = monitoring_station;
	}
	public String getLast_modify_time() {
		return last_modify_time;
	}
	public void setLast_modify_time(String last_modify_time) {
		this.last_modify_time = last_modify_time;
	}
	
}
