package proxy;

public class Printer implements Printable {
    private String name;

    public Printer() {
        this.heavyJob("Printerのインスタンスを生成中");
    }

    public Printer(String name) {
        this.name = name;
        this.heavyJob("Printerのインスタンス" + this.name + "を生成中");
    }

    @Override
    public void setPrinterName(String name) {
        this.name = name;
    }

    @Override
    public String getPrinterName() {
        return name;
    }

    @Override
    public void print(String str) {
        System.out.println("===" + this.name + "===");
        System.out.println(str);
    }

    private void heavyJob(String msg) {
        System.out.print(msg);
        for (int i = 0; i < 5; i++) {
            try {
                Thread.sleep(1000);
            } catch(InterruptedException e) {
                e.printStackTrace();
            }
            System.out.print(".");
        }
        System.out.println("完了.");
    }

}
