package proxy_anotherpattern;

public class Main {
    public static void main(String[] args) {
        Subject subject = new Proxy();

        subject.request1("Alice");
        subject.request2();
        subject.request3();
    }
}
