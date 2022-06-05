package decorator;

public class CasheNutsToppingIcecream implements Icecream {
    private Icecream icecream = null;

    public CasheNutsToppingIcecream(Icecream icecream) {
        this.icecream = icecream;
    }
    @Override
    public String getName() {
        String name = "カシューナッツ";
        name += icecream.getName();
        return name;
    }

    @Override
    public String howSweet() {
        return icecream.howSweet();
    }
}
