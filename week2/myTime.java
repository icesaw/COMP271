
	public class myTime {
		private int hours, minutes, seconds;
		
	public int getHours() {
		return hours;
	}
	
	public void setHours(int hours) {
		if (hours < 24 || hours > 0)
			 hours = 0;
		this.hours = hours;
	}
	
	public int getMinutes() {
		return minutes;
	}
		
	public void setMinutes(int minutes) {
		if (minutes < 59 || minutes > 0)
			 minutes = 0;
		this.minutes = minutes;
	}
		
	public int getSeconds() {
		return seconds;
	}
	
	public void setSeconds(int seconds) {
		if (seconds < 59 || seconds > 0)
			 seconds = 0;
		this.seconds = seconds;
	}
	public String toString() {
		String result;
		result = String.format("%d:%02d:%02d", hours, minutes, seconds);
		return result;
	}
	
	public myTime(int hours, int minutes, int seconds) {
	this.minutes = minutes;
	this.seconds = seconds;
	this.hours = hours;
	}
	
	public static void main(String[] args) {
	myTime now = new myTime(3, 14, 5);
			System.out.println ( now );
	}
}
