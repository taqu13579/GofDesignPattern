package composite;

public class File implements DirectoryEntry {
    private String name = null;
    public File(String name) {
        this.name = name;
    }

    @Override
    public void remove() {
        System.out.println(name + "を削除しました。");
    }
}
