package animals.bird_types;

import animals.Bird;
import animals.behaviours.Swim;

import java.time.LocalDateTime;

public class Penguin extends Bird implements Swim {
    @Override
    public LocalDateTime getDurationOfSwim(LocalDateTime start, LocalDateTime end) {
        return null;
    }
}
