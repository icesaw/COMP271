## Test 1 - Review
1,2 
Method Overriding - inheritance - same name, same parameters




#### What is method overloading and what is an advantage to using method overloading?
Method Overloading - same name, but different parameters
Enables you to define the methods with the same name as long as their signatures are different. 

Ex: 
```java
	sort(int[ ])
	sort(double[ ])    
 ```   
    Same sort name

#### What is method overriding?

- Overriding is a feature that allows a subclass or child class to provide a specific implementation of a method that is already provided by one of its super-classes or parent classes. When a method in a subclass has the same name, same parameters or signature and same return type(or sub-type) as a method in its super-class, then the method in the subclass is said to override the method in the super-class.

#### What are some differences between constructors and methods?

Overriding means to provide a new implementation for a method in the subclass.

|             |      Name      | Return Type | Invoke |
|---|---|---|---|
| **Methods** | any legal name |     any     |  name of method  |
| **Constructors** | same name as class | none, not even void | new  |

#### What are 2 conditions for defining a constructor?

- A constructor must have as same name as class itself.
- A constructor does not have a return type – not even void

#### Give an example of a Wrapper class

Wrapper class – processes primitive data type value as objects.

Ex: 
> Wrapping int into Integer class. Double into the Double class; char into Character class

#### What is the difference between the keyword static and final? Provide an example of each.

- Static applies to the whole class
- Final is constant, no sets, no changes.

> Ex: apply delivery charge to all pizzas, we must define delivery_charge as static. (question? he said its final inclass need to check)

#### Can a subclass or child typically do more or less (in terms of methods) than its parent or superclass?

- Yes, because child has everything the parent has. A subclass inherits accessible data fields and methods from its superclass and may also add new data fields and methods.

#### Why would you need to use the instanceof operator?

- It’s used to compare, tests types of objects. It’s to check if an object is an instance of a specific class.
```java
public void doSomething(Number param) {   
 	if( param instanceof Double) {     
		System.out.println("param is a Double");   
		}   
 		else if (param instanceof Integer) {     
			System.out.println("param is an Integer");
				}   
 	if (param instanceof Comparable) {    
 	//subclasses of Number like Double etc. implement Comparable  
   	//other subclasses might not -> you could pass Number instances that don't implement that interface    
 			System.out.println("param is comparable");   
 		} 
	}
```

#### Be able to examine code examples which uses the keywords extends, abstract, final, implements and static and be able to answer questions about their use.

- Extends vs Implements 
> Extends is for extending a class.
> Implements is for implementing an interface.
> The difference between an interface and a regular class is that in an interface you can not implement any of the declared methods. Only the class that "implements" the interface can implement the methods.


```java
	public interface ExampleInterface {     
		public void do();     
		public String doThis(int number);  
			}  
	public class sub implements ExampleInterface {    
			public void do() {       
 		//specify what must happen      
 			}      
	public String doThis(int number) {      
  		//specfiy what must happen      
 			} 
	}
```
    super() - invokes parents constructor
    
- **Superclass** defines common behavior for related subclasses. An interface can be used to define common behavior for cases (including unrelated classes).

- **Abstract Class:** Cannot be used to create objects. An abstract class can contain abstract methods, which are implemented in concrete subclasses.

**Abstract classes** are like regular classes, but you cannot create instances of abstract classes using the new operator. An abstract method if defined without implementation. Its implementation is provided by the subclasses.

- **Abstract method** cannot be contained in a nonabstract class. If a subclass of an abstract superclass does not implement all the abstract methods, the subclass must be defined abstract. In other words, in a nonabstract subclass extended from an abstract class, all the abstract methods must be implemented, even if they are not used in the subclass.

- **Instance Variables** Instance variables are declared in a class, but outside a method, constructor or any block.
When a space is allocated for an object in the heap(pilha), a slot for each instance variable value is created.

**Instance Variables** also: Created when an object is created with the use of the keyword 'new' and destroyed when the object is destroyed. 

**Hold values that must be referenced by more than one method,** constructor or block, or essential parts of an object's state that must be present throughout the class. Access modifiers can be given for instance variables.

Visible for all methods, constructors and block in the class. Normally, it is recommended to make these variables **private** (access level). However, visibility for subclasses can be given for these variables with the use of access modifiers.

**Have default values** For numbers, the default value is 0, for Booleans it is false, and for object references it is null. Values can be assigned during the declaration or within the constructor.

Can be **accessed** directly by calling the variable name inside the class. However, within static methods (when instance variables are given accessibility), they should be called using the fully qualified name. **ObjectReference.VariableName**

 - **Static Class/Variables**

Class variables also known as **static variables** are:
- Declared with the static keyword in a class, but outside a method, constructor or a block.
There would only be one copy of each class variable per class, regardless of how many objects are created from it.
Rarely used other than being declared as constants. Constants are variables that are declared as public/private, final, and static. Constant variables never change from their initial value.
Stored in the static memory. It is rare to use static variables other than declared final and used as either public or private constants.
- **Created when the program starts and destroyed when the program stops.** Visibility is similar to instance variables. However, most static variables are declared **public** since they must be available for users of the class.
Default values are same as instance variables. For numbers, the default value is 0; for Booleans, it is false; and for object references, it is null. Values can be assigned during the declaration or within the constructor. Additionally, values can be assigned in special static initializer blocks.

Can be **accessed** by calling with the class name **ClassName.VariableName**
When declaring class variables as public static final, then variable names (constants) are all in upper case. If the static variables are not public and final, the naming syntax is the same as instance and local variables.


#### Other

- 16 
> There's an abstract method - add_toppings

- 17 
```java 
 Small pizza();
 Pizza(String);
```
- 19
```java
 pizzas[0] = sm_pizza;
 pizzas[0].get_order();
```
- 20
> Implements Comparable<Pizza>;

- 21
> There's only one static variable there. static store "store is static, other variables could change, ex: size, time_ordered, cost, toppings..""

- 22 
```java
 class Large_Pizza extends Pizza {
    public Large_Pizza() {
      Super("Large");
      cost=10;
    	}
    public void add_topping(String top)
    topping += " "+ top;
    cost += .75;
    }
```



3. valid bc we made array T_shirt [ ] tee_shirts = new T_shirt[4]; so we can get price of it and in T_shirt[0] is small tshirt (is above) and we cant do T_shirt[1] bc its empty

4. bc we say to implement comparison of tshirt that why

5. 
class variables - static - country
instance variables - lack of static - Tsize

6. 
```java
class large_T_shirt extends T_shirt {
	public large_T_shirt () {
		super ("Large");
		}
	public double get_price() {
	return 15.0;
	}
}
```
