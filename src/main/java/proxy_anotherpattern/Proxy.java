package proxy_anotherpattern;

public class Proxy extends Subject {
    SubjectImpl subject;

    @Override
    public void request1(String name) {
        System.out.println("代理：Proxy-r1");
        this.name = name;
    }

    @Override
    public void request2(){
        if (subject == null) {
            System.out.println("代理：Proxy-r2");
        } else {
            subject.request2();
        }
    }

    @Override
    public void request3(){
        System.out.println("代理：Proxy-r2");
        if (subject == null) {
            subject = new SubjectImpl();
            subject.request1(this.name);
        }
        subject.request3();
    }
}
