package animals_and_behaviours;

/* The word Polymorphism means many forms, and it occurs when we have multiple classes
 * that are related to one another */

public class Main {

    public static void main(String[] args) {

        // Overloaded
        new Bird().calculateRandomAge(5);

        // Overridden
        new Bird().calculateRandomAge();


        // Polymorphism ******************************************************************

        // 1) Complete the code to demonstrate polymorphism using the Object class in Java
        BlackSparrow blackSparrow1 = new BlackSparrow();
        Bird bird1 = (Bird) blackSparrow1;
        Object bird1Obj = blackSparrow1;


        // 2) Complete the code to demonstrate upcasting:
        Bird blackSparrow2 = new BlackSparrow();


        // 3) Complete the code to demonstrate downcasting:
        Bird bird = new BlackSparrow();
        BlackSparrow blackSparrow3 = (BlackSparrow) bird;

        // End ****************************************************************************

    }

}
