package wednesday;

import java.time.LocalDateTime;

public class Time {
	
	private int hours;
	private int minutes;
	private int seconds;
	
	private int day;
	private int month;
	private int year;
	
	private static final Time timeNow = new Time();
	
	public Time(int h, int min, int s, int d, int m, int y){
		this.hours = h;
		this.minutes = min;
		this.seconds = s;
		
		this.day = d;
		this.month = m;
		this.year = y;
		
	}
	
	
	public String toString() {
		return String.format("%d:%d:%d %d.%d.%d", hours, minutes, seconds, day, month, year);
	}
	
	public Time() {
		LocalDateTime time = LocalDateTime.now();
		this.hours = time.getHour();
		this.minutes = time.getMinute();
		this.seconds = time.getSecond();
		
		this.day = time.getDayOfMonth();
		this.month = time.getMonthValue();
		this.year = time.getYear();
	}
	
	public static Time now() {
		return timeNow;
	}
	
	public static void main(String[] args) {
		Time time1 = new Time(18, 25, 20, 30, 12, 2015);
		System.out.println(time1);
		Time time2 = new Time();
		System.out.println(time2);
		Time timeNow1 = Time.now();
		System.out.println(timeNow1);
		System.out.println(Time.now());
		System.out.println(Time.now());
		
	}

}
