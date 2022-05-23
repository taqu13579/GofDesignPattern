package strategy;

public class GuuStrategy implements Strategy {
    @Override
    public Hand nextHand() {
        return Hand.getHand(Hand.HANDVALUE_GUU);
    }
}
