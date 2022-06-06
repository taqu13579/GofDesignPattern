package command2;

public class Beaker {
    private double water = 0;
    private double salt = 0;
    private boolean melted;
    public static final int ADD_SALT = 1;
    public static final int ADD_WATER = 2;

    public Beaker(double water, double salt) {
        this.water = water;
        this.salt = salt;
        this.mix();
    }

    public void addSalt(double salt) {
        this.salt += salt;
    }

    public void addWater(double water) {
        this.water += water;
    }

    public void mix() {
        if ((salt / (salt + water)) * 100 < 26.4) {
            melted = true;
        } else {
            melted = false;
        }
    }

    public double getSalt() {
        return salt;
    }

    public double getWater() {
        return water;
    }

    public boolean isMelted() {
        return melted;
    }

    public void note() {
        System.out.println("水：" + water + "g");
        System.out.println("食塩：" + salt + "g");
        System.out.println("濃度：" + (salt/(water + salt)) * 100 + "%") ;
    }
}
