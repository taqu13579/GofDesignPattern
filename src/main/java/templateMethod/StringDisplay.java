package templateMethod;

public class StringDisplay extends AbstractDisplay {
    private String str;
    private int widht;

    public StringDisplay(String str) {
        this.str = str;
    }

    @Override
    public void open() {

    }

    @Override
    public void print() {
        System.out.println("|" + str + "|");
    }

    @Override
    public void close() {

    }

    private void printLine() {
        System.out.println("+");
        for (int i = 0; i < widht; i++) {
            System.out.println("-");
        }
        System.out.println("+");
    }
}
