# COMP271
Programming II - 18FA-COMP-271-001RL

## Test 1 - Preparation

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

- The important difference between constructors and methods are: Constructors create and initialize objects that don't exist yet, while methods perform operations on objects that already exist. Constructors can't be called directly; they are called implicitly when the new keyword creates an object.

#### What are 2 conditions for defining a constructor?







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
#### Why would you need to use the instanceof operator?
#### Be able to examine code examples which uses the keywords extends, abstract, final, implements and static and be able to answer questions about their use.
