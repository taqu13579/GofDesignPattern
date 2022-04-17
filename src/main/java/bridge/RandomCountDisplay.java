package bridge;

import java.util.Random;

public class RandomCountDisplay extends CountDisplay {
    private Random random = new Random();

    public RandomCountDisplay(DisplayImpl impl) {
        super(impl);
    }

    public void randomDisplay(int items) {
        multiDisplay(random.nextInt(items));
    }
}
