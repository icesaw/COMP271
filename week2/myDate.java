public  class myDate
  {
    
    private int month, day, year;
	private String[] month_names ={ "", "Jan", "Feb", "Mar", 
		"Apr", "May", "Jun",
		"Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
	
	  // Add constructor and methods
	
	
	public myDate(int month, int day, int year) {
		this.month = month;
		this.day = day;
		this.year = year;
	}
	
	public int getMonth() {
		return month;
	}
	
	public void setMonth(int month) {
		if (month < 1 || month > 12)
			month = 1;
		this.month = month;
	}
	
	public int getDay() {
		return day;
	}
	
	public void setDay(int day) {
		this.day = day;
	}
	
	public int getYear() {
		return year;
	}
	
	public void setYear(int year) {
		this.year = year;
	}
	
	public String getMonthName() {
	return month_names [month];	
	}
	
	public String toString() {
	 
		String result;
		result = getMonthName() + " " + day + ", " + year;
		return result;
	}
	
	
	
  	  
  
	public static void main(String[] args) {
		
			myDate now = new myDate(9, 17, 2018);
			
				System.out.println ( now );
		
		}
  }
	
	 
	
  
