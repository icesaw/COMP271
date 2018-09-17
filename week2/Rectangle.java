
public class Rectangle {

	private int width;
	private int length;
	
	public  Rectangle(int width, int length) {
		setWidth ( width);
		setLength( length );
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
	
	public int findPerimeter() {
		return 2 * width + 2 * length;
	}

	@Override
	public String toString() {
		return 	"Rectangle [width=" + width + 
				", length=" + length + 
				", findArea()=" + findArea() + 
				", findPerimeter()="
				+ findPerimeter() + "]";
	}
	
	
	
}
