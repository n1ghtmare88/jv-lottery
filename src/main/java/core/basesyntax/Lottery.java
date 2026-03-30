package core.basesyntax;

import java.util.Random;

public class Lottery {
    private final Random randomNumber;
    private final ColorSupplier randomColor;
    private final int bound = 101;

    public Lottery() {
        randomNumber = new Random();
        randomColor = new ColorSupplier();
    }

    public Ball getRandomBall() {
        return new Ball(randomColor.getRandomColor(),randomNumber.nextInt(bound));
    }
}
