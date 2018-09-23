// Alexey Milovanov
// COMP271
// LAB1

package week2;

public class myInteger {
	private int value;

	myInteger(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}

	public boolean isEven() {
		return isEven(value); 
	}

	public boolean isOdd() {
		return isOdd(value); 
	}

	public boolean isPrime() {
		return isPrime(value);
	}

	public static boolean isEven(int value) {
		return value % 2 == 0;
	}

	public static boolean isOdd(int value) {
		return value % 2 != 0;
	}

	public static boolean isPrime(int value) {
		for (int divisor = 2; divisor <= value / 2; divisor++) {
			if (value % divisor == 0)
				return false;
		}
		return true;
	}

	public static boolean isEven(myInteger myInteger) {
		return myInteger.isEven();
	}

	public static boolean isOdd(myInteger myInteger) {
		return myInteger.isOdd();
	}

	public static boolean isPrime(myInteger myInteger) {
		return myInteger.isPrime();
	}

	public boolean equals(int value) {
		return this.value == value;
	}

	public boolean equals(myInteger myInteger) {
		return myInteger.value == this.value;
	}

	public static int parseInt(char[] chars) {
		int value = 0;
		for (int i = 0, j = (int)Math.pow(10, chars.length - 1); 
			  i < chars.length; i++, j /= 10) {
			value += (chars[i]- 48) * j;
		}
		return value;
	}

	public static int parseInt(String str) {
		int value = 0;
		for (int i = 0, j = (int)Math.pow(10, str.length() - 1); 
			  i < str.length(); i++, j /= 10) {
			value += (str.charAt(i) - 48) * j;
		}
		return value;
	}

		
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			
			myInteger number = new myInteger(5);
			System.out.println( "Your number is: " + number.getValue() + "\n");
			//Evens
			System.out.println( "Is " + number.getValue() + " even? " + number.isEven());
			System.out.println( "Is 10 " + "even? " + myInteger.isEven(10) + "\n");
			//Odds
			System.out.println( "Is " + number.getValue() + " odd? " + number.isOdd());
			System.out.println( "Is 10 " + "odd? " + myInteger.isOdd(10) + "\n");
			//Primes
			System.out.println( "Is " + number.getValue() + " prime? " + number.isPrime());
			System.out.println( "Is 10 " + "prime? " + myInteger.isPrime(10) + "\n");
			
			//Equals
			int[] values2 = {5, 9, 7};
			
			//myInteger value = new myInteger(9);
			System.out.println("Test if " + number.getValue() + " is equal to the specified value:");
			for (int i = 0; i < values2.length; i++) {
				System.out.println(values2[i] + " " + number.equals(values2[i]));}
			
			System.out.println("\nTest if " + number.getValue() + " is equal to the specified value:");
				for (int i = 0; i < values2.length; i++) {
					myInteger myInteger = new myInteger(values2[i]);	
					System.out.println(values2[i] + " " + number.equals(myInteger));
				}
			
			
				// Test parseInt(char[]) and parseInt(String)
			System.out.println("\nTest parseInt(char[]) and parseInt(String):");
				
				char[] numericCharacters = {'3', '4', '2'};

			String numericString = "658";
			System.out.print("\'");
				for (int i = 0; i < numericCharacters.length; i++) {
				 	System.out.print(numericCharacters[i] + "");
				} 
			System.out.println("\' + \"" + numericString + "\" = " + 
					(myInteger.parseInt(numericCharacters) + 
					myInteger.parseInt(numericString)));	
				
				
		}

	}
