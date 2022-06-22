package animals_and_behaviours;

// An example of how we can implement Multi-Level inheritance with interfaces
public class Bird extends Animal implements CanFly, Hop {

    @Override
    public void fly(double altitude, double speed) {

    }
    @Override
    public int getMaxHopHeight() {
        return Hop.super.getMaxHopHeight();
    }

    // Overriding
    @Override
    protected int calculateRandomAge() {
        return 0;
    }

    // Overloading
    protected int calculateRandomAge(int factor) {
        return 0;
    }
}
