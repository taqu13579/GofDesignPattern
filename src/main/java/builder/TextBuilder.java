package builder;

public class TextBuilder extends Builder {
    private StringBuffer buffer = new StringBuffer();
    private String LINE_SEPARATOR = System.getProperty("line.separator");

    @Override
    public void makeTitle(String title) {
        buffer.append("===============================");
        buffer.append(LINE_SEPARATOR);
        buffer.append("「" + title + "」");
        buffer.append(LINE_SEPARATOR);
    }

    @Override
    public void makeString(String str) {
        buffer.append('■' + str + LINE_SEPARATOR);
    }

    @Override
    public void makeItems(String[] items) {
        for (String item : items) {
            buffer.append("・" + item + LINE_SEPARATOR);
        }
        buffer.append(LINE_SEPARATOR);
    }

    @Override
    public void close() {
        buffer.append("===============================");
    }

    @Override
    public String getResult() {
        return buffer.toString();
    }
}
