
public class Tee_Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Small_Tee_shirt sm=new Small_Tee_shirt();
		
		Lg_Tee_shirt lg=new Lg_Tee_shirt();
		
		System.out.println(sm);
		System.out.println(lg);
	}

}//end of Tee_Driver

class Tee_shirt{
	protected String size;
	private final String madeIn="USA";
	public Tee_shirt(String size) {
		this.size= size;
		
	}//if we want all tshirt be 10 we would put  public final double getPrice
	public double getPrice() {
		return 10;
	}
	public String toString() {
		return "the size is " + this.size +" and the price is " +this.getPrice()+ " made in"+ madeIn;
	}
}//end of Tee_shir

class Small_Tee_shirt extends Tee_shirt{
	public Small_Tee_shirt() {
		super("small");
	}
}//end of small

class Md_Tee_shirt extends Tee_shirt{
	public Md_Tee_shirt() {
		super("medium");
	}
}//end of Medium
class Lg_Tee_shirt extends Tee_shirt{
	public Lg_Tee_shirt() {
		super("Large");
	}
	public double getPrice() {
		return 12;
	}
}//end of large
