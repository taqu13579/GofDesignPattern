package state;

public class BadMoodState implements State {
    @Override
    public String morningGreet() {
        return "おお";
    }

    @Override
    public String getProtectionForCold() {
        return "ももひき";
    }
}
