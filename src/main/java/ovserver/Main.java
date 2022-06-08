package ovserver;

public class Main {
    public static void main(String[] args) {
        NumberGenerator generator = new RandomNumberGenerator();
        Observer degitObserver = new DegitObserver();
        Observer graphObserver = new DegitObserver();
        generator.addObserver(degitObserver);
        generator.addObserver(graphObserver);
        generator.execute();
    }
}
