import java.util.Date;

public class PizzaDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SmallPizza sm = new SmallPizza();
		sm.addTopping("Peppers");
		sm.addTopping("Onions");
		
		System.out.println( sm);
		
		LargePizza lg = new LargePizza();
		
		System.out.println(lg);
		
		//Pizza pz=new Pizza ("xLarge");
		//System.out.println(pz);
		
		Sicilian sicilian=new Sicilian();
		sicilian.addTopping("Peppers");
		System.out.println(sicilian);
	}

} // end of PizzaDriver
abstract class Pizza {
	protected String size;
	protected Date timeOrder;
	protected String toppings;
	protected double cost;
	public abstract  void addTopping( String topping);
	
	public Pizza(String size) {
		this.size = size;
		timeOrder = new Date();
		toppings = "";
	}
	//all pizza have 5 dollar delivery charge
	public final double get_delivery_charge() {
		return 5;
	}
	
	public String toString() {
		String order;
		if (toppings.isEmpty()) {
		order = String.format
		("At %s a %s pizza was ordered, the price is %.2f", 
				 timeOrder, size, cost);
		}
		else {
			order = String.format
("At %s a %s pizza was ordered with these toppings %s, the price is %.2f", 
			timeOrder, size, toppings, cost);	
		}
		return order;
	}
} // end of Pizza

class SmallPizza extends Pizza {
	public SmallPizza() {
		super("Small");
		cost = 8;
	}
	
	public void addTopping( String topping) {
		cost += .25;
		toppings = toppings + " " + topping;
	}
} // end of SmallPizza

class MediumPizza extends Pizza {
	public MediumPizza() {
		super("Medium");
		cost = 10;
	}
	public void addTopping( String topping) {
		cost += .5;
		toppings = toppings + " " + topping;
	}
} // end of MediumPizza

class Sicilian extends Pizza {
	public Sicilian() {
		super("Sicilian");
		cost = 15;
	}
	public void addTopping( String topping) {
		cost += .75;
		toppings = toppings + " " + topping;
}
	}//end of sicilian

class LargePizza extends Pizza {
	public LargePizza() {
		super("Large");
		cost = 12;
	}
	public void addTopping( String topping) {
		cost += .75;
		toppings = toppings + " " + topping;
	}
} // end of LargePizza