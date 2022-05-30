package state;

public class OrdinaryState implements State {
    @Override
    public String morningGreet() {
        return "おっす";
    }

    @Override
    public String getProtectionForCold() {
        return "はしる";
    }
}
