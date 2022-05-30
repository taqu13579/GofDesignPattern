package state;

public class GoodMoodState implements State {
    @Override
    public String morningGreet() {
        return "おはよう";
    }

    @Override
    public String getProtectionForCold() {
        return "マフラー";
    }
}
