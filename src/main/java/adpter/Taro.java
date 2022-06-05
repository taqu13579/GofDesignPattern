package adpter;

public class Taro implements Chairperson {
    @Override
    public void organizeClass() {
        enjoyWithAllClassmate();
    }

    public void enjoyWithAllClassmate() {
        System.out.println("みんなで楽しむ");
    }
}
