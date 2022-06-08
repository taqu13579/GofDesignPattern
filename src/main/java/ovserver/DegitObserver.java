package ovserver;

public class DegitObserver implements Observer {
    @Override
    public void update(NumberGenerator numberGenerator) {
        System.out.println("DegitObserver:" + numberGenerator.getNumber());
        try {
            Thread.sleep(100);
        } catch(InterruptedException e) {
            e.printStackTrace();
        }
    }
}
