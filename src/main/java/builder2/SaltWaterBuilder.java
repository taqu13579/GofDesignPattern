package builder2;

public class SaltWaterBuilder implements Builder {
    private SaltWater saltWater;

    public SaltWaterBuilder() {
        this.saltWater = new SaltWater(0, 0);
    }

    @Override
    public void addSoult(double soultAmount) {
        saltWater.water += soultAmount;
    }

    @Override
    public void addSolvent(double solventAmount) {
        saltWater.water += solventAmount;
    }

    @Override
    public void abandonSolution(double solutionAmount) {
        double saltDelta = solutionAmount *
                (saltWater.salt / (saltWater.salt + saltWater.water));
        double waterDelta = solutionAmount *
                (saltWater.water / (saltWater.salt + saltWater.water));
        saltWater.salt -= saltDelta;
        saltWater.water -= waterDelta;
    }

    @Override
    public Object getResult() {
        return this.saltWater;
    }
}
