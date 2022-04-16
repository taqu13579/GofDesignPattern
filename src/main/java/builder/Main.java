package builder;

public class Main {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.exit(0);
        }

        String format = args[0];
        Builder builder;
        if (format.equals("plain")) {
            builder = new TextBuilder();
            Guide guide = new Guide(builder);
            guide.construct();
            String result = builder.getResult();
            System.out.println(result);
        } else if (format.equals("html")) {
            builder = new HTMLBuilder();
            Guide guide = new Guide(builder);
            guide.construct();
            String filename = builder.getResult();
            System.out.println(filename);
        } else {
            System.exit(0);
        }
    }
}
