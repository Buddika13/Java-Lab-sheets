Practical 05
Exercise 01
public interface Myfirstinterface {
 int x=10;
 void display();
}
1. public interface MyInterface {
    int variable1 = 10;
    public static final int variable2�=�20;
}
Public: Both variables are implicitly public, meaning they can be accessed from outside the interface.
Static: Both variables belong to the interface itself, not to any specific instance of a class implementing the interface.
Final: Both variables are implicitly final, and their values cannot be changed once assigned.
So there is no practical difference between declaring variables with or without the public static final keywords in�an�interface.


2. public interface MyInterface {
    void method1();
    abstract void�method2();
}


3. public class InterfaceImplemented implements MyFirstInterface {
    @Override
    public void display() {
        // Try to change the value of x
        x = 20; // This will result in a compilation error

        System.out.println("Value of x:�"�+�x);
����}
}

Exercise 02

Interface speaker
public interface Speaker {
    public void speak();
}

Class Priest
public class Priest imlements Speaker {
    @Override
    public void speak(){
        System.out.println("Preach");
    }
    
}

Class Politician
public class Politician implements Speaker {
  @Override 
  public void Speak(){
      System.out.println("Political");
  }
}

Class Lecture
public class Lecture implements Speaker{
 public void speak(){
     System.out.println("Lecturing");
 }   
}

Main method
public class Q3 {

    public static void main(String[] args) {
        Lecture obj1=new Lecture();
        obj1.Speak();
        
        Politician obj12=new Politician();
        obj12.Speak();
        
        Priest obj3=new Priest();
        obj3.Speak();
        
    }
    
}
Output	
--- exec-maven-plugin:3.1.0:exec (default-cli) @ Practicals�---		
Lecturing
Political
Preach

Exercise 03
he code builds successfully but nothing runs. 
Method in the parent class Student, Display() method is declared as Final. Hence it cannot be overridden by the child class. 
Variable Marks is also declared Final which makes it impossible to change the amount which has been assigned to that variable. 
Student class itself is declared as Final. A class which has been declared Final cannot be extended by�a�subclass.

Exercise 04

Abstract Class Shape
package com.mycompany.lab5;
abstract class Shape {
    protected double area;
    abstract double calculatearea();
    public void display(){
        System.out.println("Area: " +calculatearea());
    }    
}
Class Rectangle
package com.mycompany.lab5;

public class Rectangle extends Shape{
    protected double l;
    protected double w;

    public void setvalue(double l, double w) {
    this.l=l;
    this.w=w;
        System.out.println("Rectangle");
    }
    @Override
    public double calculatearea(){
    return area=l*w;
    }
}
Class Circle
package com.mycompany.lab5;

public class circle extends Shape {
    protected double r;
    public void setvalue(double r){
    this.r=r;
        System.out.println("Circle:");
    }
    @Override
    public double calculatearea(){
    return area= 3.14*r*r;
     }
}
Main Method
package com.mycompany.lab5;

public class Lab5 {

    public static void main(String[] args) {
        Rectangle r1=new Rectangle();
        r1.setvalue(5.00, 7.00);
        r1.calculatearea();
        r1.display();
    circle c1=new circle();
    c1.setvalue(5.00);
    c1.calculatearea();
    c1.display();
����}
}
Output	
--- exec-maven-plugin:3.1.0:exec (default-cli) @ Practicals�---
Rectangle
Area: 35.0
Circle:
Area:�78.5		
