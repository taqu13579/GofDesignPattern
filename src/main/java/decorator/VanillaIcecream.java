package decorator;

public class VanillaIcecream implements Icecream {
    @Override
    public String getName() {
        return "バニラアイスクリーム";
    }

    @Override
    public String howSweet() {
        return "バニラ味";
    }
}
