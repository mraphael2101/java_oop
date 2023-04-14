package animals.bird_types;

import animals.Bird;
import animals.behaviours.CanFly;
import animals.behaviours.Hop;

public class Eagle extends Bird implements CanFly, Hop {
    @Override
    public void fly(double altitude, double speed) {

    }
}
