package proxy_anotherpattern;

public class SubjectImpl extends Subject {
    @Override
    public void request1(String name) {
        System.out.println("本人：SubjectImpl-r1");
        this.name = name;
    }

    @Override
    public void request2() {
        System.out.println("本人：SubjectImpl-r2");
    }

    @Override
    public void request3() {
        System.out.println("本人：SubjectImpl-r3");
    }
}
