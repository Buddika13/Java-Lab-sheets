Practical 3
Exercise 3.1
public class EncapsulationDemo {
    private String EmpName;
    private int age;
    private float salary;
    private float bonus;
    public EncapsulationDemo(String EmpName, int age, float salary, float bonus){
    this.age=age;
    this.EmpName=EmpName;
    this.salary=salary;
    }
    public void setEmpName(String Name){
    EmpName=Name;
    }
     public String getEmpName(){
    return EmpName;
    }
         public void setBSalary(float BSalary){
    salary=BSalary;
    }
     public float getBSalary(){
    return salary;
    }
    
     public float CalcBonus(){
         return bonus+salary;
     }
     public void Display(){
        System.out.println("Emp Name: " +EmpName);
        System.out.println("Basic Salary: " +salary);
        System.out.println("Bonus Amount: " +(bonus+salary));
        
     }
}
Main method
package com.mycompany.practicals;
public class Practicals {

    public static void main(String[] args) {
    EncapsulationDemo e1=new EncapsulationDemo("Buddika",22, 60000.0f, 10000.0f) ;
    e.CalcBonus();
    e.Display();
    }
}
Output			-	Emp name : Buddika
                          Basic Salary : 60000.0
                          Bonus  : 10000.0
                          Bonus Amount : 70000.0

