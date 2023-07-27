Practical 04
Exercise 1
Employee Class
package com.mycompany.exercise1;
public class Employee {
    private int empID;
    private String empname;
    private String empDesignation;
    public void setempID(int ID){
    empID=ID;
    }
    public void setempname(String n){
    empname=n;
    }
    public void setempDesignation(String d){
    empDesignation=d;
    }
    public int getempID(){
    return empID;
    }
    public String getempname(){
    return empname;
    }
    public String getempDesignation(){
    return empDesignation;
    }
}




The class used to invoke Employee Class
public class exercise1 {

    public static void main(String[] args) {
        Employee Bo=new Employee(); 
        Bo.setempname("Mr. bogdan");
        Bo.setempID(101);
        Bo.setempDesignation("Chief executive marketer");
        
        Employee Bi=new Employee();
        Bi.setempname("Ms.Bird");
        Bi.setempID(103);
        Bi.setempDesignation("Junior Executive");
       
        {
            System.out.println("Employee name: "+Bo.getempname());
            System.out.println("Employee number: "+Bo.getempID());
            System.out.println("Designation: "+Bo.getempDesignation());
        }
        System.out.println("");
         {
            System.out.println("Employee name: "+Bi.getempname());
            System.out.println("Employee number: "+Bi.getempID());
            System.out.println("Designation: "+Bi.getempDesignation());
 �������}
����}
}
Exercise 02
public class Testinheritence {
    public static void main(String[] args) {
        SuperB b = new SuperB();
        b.setIt(2);
        b.increase();
        b.triple();
        System.out.println( b.returnIt() ); 
        SubC c = new SubC();
        c.setIt(2);
        c.increase();
        c.triple();
        System.out.println( c.returnIt()�);�
}
}
    public class SubC extends SuperB {
    void triple () {x=x+3;} // override existing method
    void quadruple () {x=x*4;} // new method
    
}
public class superB {
    int x;
    void setIt (int n) { x=n;}
    void increase () { x=x+1;}
    void triple () {x=x*3;};
    int returnIt () {return x;}
}
Output		-	     exec-maven-plugin:3.1.0:exec (default-cli) @ Lab3point2�
                        9
                        6
                        
Exercise 03
Person class
package com.mycompany.exercise3;

public class person {
    private String name;
    private int id;
    public person(String name,int Id){
        this.name=name;
        this.id=id;
    }
    public String getname(){
        return name;
    }
    public int getid(){
        return id;
    }
    public void setname(String name){
        this.name=name;
    }
    public void setid(int id){
        this.id=id;
    }
}

Student class
public class student extends person {
    private String course;
    public student(String name,int id,String course){
        super(name,id);
        this.course=course;
    }
    public String getcourse(){
        return course;
    }
    public void setcourse(String course){
        this.course=course;
    }
}

Lecture class
public class lecture extends person {
    private String programme;
    public lecture(String name,int id,String programme){
    super(name,id);
    this.programme=programme;
}
    public String getprogramme(){
    return programme;
}
    public void setprogramme(String programme){
        this.programme=programme;
    }
}

public class Exercise3 {

    public static void main(String[] args) {
        student student=new student("kamal",1234,"Computer Network");
        lecture lecture=new lecture("nimal",1456,"Management");
        System.out.println("Student Details:");
        System.out.println("Name:"+student.getname());
        System.out.println("ID:"+student.getid());
        System.out.println("Course:"+student.getcourse());
        
        System.out.println("\nLecure Details");
        System.out.println("Name:"+lecture.getname());
        System.out.println("ID:"+lecture.getid());
        System.out.println("Programme:"+lecture.getprogramme());
    }
}
Exercise 04

Animal class
Public class animal{
 }

Mammal class
public class mammal extends animal {
    
}
Reptile class
public class reptile extends animal {
    
}
Dog class
public class dog {
    
}
public class Exe3 {

    public static void main(String[] args) {
        animal a=new animal();
        mammel m=new mammel();
        dog d=new dog();
        System.out.println(m instance of animal);
        System.out.println(d instance of mammel);
        System.out.println(d instance of animal);
    }
    
}
