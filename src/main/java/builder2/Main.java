package builder2;

public class Main {
    public static void main(String[] args) {
        Builder builder = new SaltWaterBuilder();
        Director director = new Director(builder);
        director.constract();
        SaltWater water = (SaltWater)builder.getResult();
        System.out.println("salt:" + water.salt + ", water:" + water.water);
    }
}
