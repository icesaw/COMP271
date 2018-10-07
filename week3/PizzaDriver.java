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
		
		
	}

} // end of PizzaDriver
class Pizza {
	protected String size;
	protected Date timeOrder;
	protected String toppings;
	protected double cost;
	
	public Pizza(String size) {
		this.size = size;
		timeOrder = new Date();
		toppings = "";
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