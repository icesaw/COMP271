# COMP271 - Programming II
## Professor - John Mensing
## Term - 18FA-COMP-271-001RL

### Test 1 - Preparation

#### What is method overloading and what is an advantage to using method overloading?

- Overloading in Java is the ability to create multiple methods of the same name, but with different parameters.
- The main advantage of this is cleanliness of code.
- Method overloading increases the readability of the program.
- Overloaded methods give programmers the flexibility to call a similar method for different types of data.
- Overloading is also used on constructors to create new objects given different amounts of data.
- You must define a return type for each overloaded method. Methods can have different return types

#### What is method overriding?

- Overriding is a feature that allows a subclass or child class to provide a specific implementation of a method that is already provided by one of its super-classes or parent classes. When a method in a subclass has the same name, same parameters or signature and same return type(or sub-type) as a method in its super-class, then the method in the subclass is said to override the method in the super-class.

#### What are some differences between constructors and methods?

- Constructors create and initialize objects that don't exist yet, while methods perform operations on objects that already exist.
- Constructors can't be called directly; they are called implicitly when the new keyword creates an object.
- Constructors are used to initialize the state of object using the new operator.

|             |      Name      | Return Type | Invoke |
|---|---|---|---|
| Methods     | Any legal name |     Any     |  Call  |
|---|---|---|---|
|Constructors | Same name as class | none, not even void | new  |
|---|---|---|---|




#### What are 2 conditions for defining a constructor?

- A constructor must have as same name as class itself.
- A constructor does not have a return type – not even void

#### Give an example of a Wrapper class

- Converting a Primitive type to Wrapper object

  ```java public class JavaExample {  
      public static void main(String args[]) {  
		//Converting int primitive into Integer object  
          	int num=100;  
	        Integer obj=Integer.valueOf(num);  
          System.out.println(num + " " + obj);
          }
       }

- Converting Wrapper class object to Primitive

```java public class JavaExample{  
   	public static void main(String args[]){  
		//Creating Wrapper class object 
		Integer obj = new Integer(100);  
		//Converting the wrapper object to primitive
		int num = obj.intValue();
	   System.out.println(num + " " + obj);  
   	   }
	}
```

#### What is the difference between the keyword static and final? Provide an example of each.




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

