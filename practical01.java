	Practical 1
Question 01
public class Practical1 {
    public static void main(String[] args) {
        System.out.println("Hello World!");
    }
}
Question 02
public class NameandDegree {
    public static void main(String[] args) {
        System.out.println("My name is Madushani Buddika");
        System.out.println("My degree programme is computer Networking");
    }
}
Question 03
public class Forloop {
    public static void main(String[] args) {
        for(int=1;i<5;i++){
        System.out.println("Executing for loop"+i);
      }
    }
}
public class Whileloop {
    public static void main(String[] args) {
        int i=0;
         while(i<5){       
        System.out.println("Executing while loop"+i);
        i++;
      }
    }
    Question 04
Using break
public class break{
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        for (int x : numbers) {
            if (x == 30) {
                break;
            }
            System.out.print(x);
            System.out.print("\n");
        }
        System.out.print("I'm out of the Loop�now");
����}
}
Output		-	10
20
I�m out of the Loop now

Using Continue
public class Continue {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        for (int x : numbers) {
            if (x == 30) {
                continue;
            }
            System.out.print(x);
            System.out.print("\n");
        }
        System.out.print("I'm out of the Loop�now");
����}
}
Output		-	10
                    20
                    40
                    50
                    I�m out of the Loop now

Question 05
public class grade {
    public static void main(String[] args) {
        char grade = 'A';
        switch (grade) {
            case 'A':
                System.out.println("Excellent!");
                break;
            case 'D':
                System.out.println("You passed");
            case 'F':
                System.out.println("Better try again");
                break;
            default:
                System.out.println("Invalid grade");
        }
        System.out.println("Your grade is " +�grade);
����}
}
Output		-    For A 
               	Excellent!
               	Your grade is A
               For D 
               	You passed
               	Better try again
               	Your grade is D
               For F 
               	Better ty again
               	Your�grade�is�F
Removing �Break� in line no 6:
public class grade {
    public static void main(String[] args) {
        char grade = 'A';
        switch (grade) {
            case 'A':
                System.out.println("Excellent!");
            case 'D':
                System.out.println("You passed");
            case 'F':
                System.out.println("Better try again");
                break;
            default:
                System.out.println("Invalid grade");
        }
        System.out.println("Your grade is " +�grade);
����}
}
Output		-	For A 
                    	Excellent!
                    	You passed
                    	Better try again
                    	Your grade is A
                    For D 
                    	You passed
                    	Better try again
                    	Your grade is D
                    For F 
                    	Better ty again
                    	Your�grade�is�
Repeat the same scenario by using it-else-if statement instead of switch case

public class grade {
    public static void main(String[] args) {
        char grade = 'F';
        
        if (grade == 'A') {
            System.out.println("Excellent!");
        } else if (grade == 'D') {
            System.out.println("You passed");
        } else if (grade == 'F') {
            System.out.println("Better try again");
        } else {
            System.out.println("Invalid grade");
        }

        System.out.println("Your grade is " +�grade);
����}
}
Output		-	For A 
                    	Excellent!
                    	Your grade is A
                    For D 
                    	You passed
                    	Your grade is D
                    For F 
                    	Better try again
                    	Your�grade�is�F
Question 06
public class App {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        for (int x : numbers) {
            System.out.print(x);
            System.out.print(",");
        }
        System.out.print("\n");
        String[] names = {"James", "Larry", "Tom", "Lacy"};
        for (String name : names) {
            System.out.print(name);
            System.out.print(",");
 �������}
����}
}
