package animals.runner;

import animals.Bird;
import animals.bird_types.Penguin;

/* The purpose of this exercise is to demonstrate a few of the key concepts
of Object-Oriented Programming in Java.

Using the sample classes provided in the animals package,
complete the exercise by writing code to implement the following:
1) Multi-Level Inheritance using Interfaces
2) Method Overriding with Abstract classes
3) Method Overloading
4) Encapsulation
5) Polymorphism */

public class Main {

    public static void main(String[] args) {

        //TODO Question 2: Insert the code below to demo calling an Overridden method here
        new Bird().calculateRandomAge();

        //TODO Question 3: Insert the code below to demo calling an Overloaded method here
        new Bird().calculateRandomAge(5);

        //TODO Question 4: Insert the code below to demo Encapsulation here
        new Bird().getAge();
        new Bird().setAge(3);

        //TODO Question 5: Polymorphism ************************************************

        // A) Complete the code to demonstrate polymorphism using the Object class in Java
        Penguin penguin1 = new Penguin();
        Bird bird1 = (Bird) penguin1;
        // Insert code here
        Object bird1Obj = bird1;

        // B) Demonstrate upcasting:
        // Insert code here
        Bird penguinBird = new Penguin();

        // C) Demonstrate downcasting:
        Bird bird = new Penguin();
        // Insert code here
        Penguin penguin = (Penguin) bird;

        //TODO Question 5: End ***********************************************************

    }

}
