Practical 02
Part 1
1. public class Item {
    protected int location;
    protected String�description;

2. //constructer
public Item(int location, String description) {

3. this.location = location;
        this.description = description;
����}
4. // Getter for location
    protected int getLocation() {
        return location;
    }

    // Setter for location
    protected void setLocation(int location) {
        this.location = location;
    }

    // Getter for description
    protected String getDescription() {
        return description;
    }

    // Setter for description
    protected void setDescription(String description) {
        this.description = description;
����}
}
5. public class Monster extends Item {
    // Constructor
    public Monster(int location, String description) {
        super(location, description);
����}
}
Part 02
1.b) super
2.b) private
3.b) Packages
4.c) import pkg.*
5.c) charAt()
6.d)�length()
Part 03
1.Real-world objects contain attributes and behaviors.
2. A software object's state is stored in instance variables.
3. A software object's behavior is exposed through methods.
4. Hiding internal data from the outside world, and accessing it only through publicly exposed methods is known as data encapsulation.
5. A blueprint for a software object is called a class.
6. Common behavior can be defined in a parent class and inherited into a subclass using the extends keyword.
7. A collection of methods with no implementation is called an interface.
8. A namespace that organizes classes and interfaces by functionality is called a package.
9. The term API stands for Application Programming�Interface.
