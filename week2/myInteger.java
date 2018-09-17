
public class myInteger {

	
	private int value;
		
	public myInteger(int value) {
		super();
		this.value = value;
	}


	public int getValue() {
		return value;
	}
	public static boolean isEven(int num) {
		if ((num %2) == 0)
	 return true;
		else
	 return false;
	
}

	public boolean isEven() {
		boolean result;
		result = myInteger.isEven(value);
	return result;

} 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		myInteger num1 = new myInteger(5);
		System.out.println( "is " + num1.getValue() + " even? " + num1.isEven());
		System.out.println( "Is 10 " + " even? " + myInteger.isEven(10));
		
	}

}
