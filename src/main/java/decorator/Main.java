package decorator;

public class Main {
    public static void main(String[] args) {
        Icecream icecream1 = new CasheNutsToppingIcecream(new VanillaIcecream());
        Icecream icecream2 = new CasheNutsToppingIcecream(new GreenTeaIcecream());
        System.out.println("icecream1:" + icecream1.getName() + ", " + icecream1.howSweet());
        System.out.println("icecream2:" + icecream2.getName() + ", " + icecream2.howSweet());
    }
}
