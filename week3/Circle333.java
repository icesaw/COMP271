// Used to find some errors
public class Circle333 
{
	private double radius;
	public Circle333 (double radius)
	{
		this.radius = radius;
	}
	public double getRadius(){
		return radius;
	}
	public double getArea() {
		return radius * radius * Math.PI;
	}
}
class B1 extends Circle333 
{
	private double length;

	public B1(double radius, double length)
	{
		super(radius); 
		this.length = length;
	}
	public double getArea(){
		return super.getArea() * length;
	}
}
