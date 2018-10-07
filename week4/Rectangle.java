
public class Rectangle  {

	private int width;
	private int length;
	
	public Rectangle(int width, int length) {
		this.setWidth ( width );
		this.setLength ( length );
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		if (width < 0)
			width *= -1;
		this.width = width;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		if (length < 0)
			length *= -1;
		this.length = length;
	}

	public int findArea() {
		return width * length;
	}
	
	
	public String toString() {
		return "Rectangle [width=" + width + ", length=" + length
				+ ", findArea()=" + findArea() + "] " ;
				
	} 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle myrect = new Rectangle( 5, 10);
		
		
		System.out.println( myrect );
		

	}

}