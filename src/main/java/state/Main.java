package state;

public class Main {
    public static void main(String[] args) {
        StatePatternHuman human = new StatePatternHuman();
        State state1 = new BadMoodState();
        human.changeState(state1);
        System.out.println(human.morningGreet());
        System.out.println(human.getProtectionForCold());
        State state2 = new OrdinaryState();
        human.changeState(state2);
        System.out.println(human.morningGreet());
        System.out.println(human.getProtectionForCold());
        State state3 = new GoodMoodState();
        human.changeState(state3);
        System.out.println(human.morningGreet());
        System.out.println(human.getProtectionForCold());
    }
}
