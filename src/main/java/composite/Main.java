package composite;

public class Main {
    public static void main(String[] args) {
        File file1 = new File("file 1");
        File file2 = new File("file 2");
        File file3 = new File("file 3");
        File file4 = new File("file 4");
        SymbolicLink slink = new SymbolicLink("slink 1");
        Directory dir1 = new Directory("dir1");
        dir1.add(file1);
        dir1.add(slink);
        Directory dir2 = new Directory("dir2");
        dir2.add(file2);
        dir2.add(file3);
        dir1.add(dir2);
        dir1.add(file4);

        dir1.remove();
    }
}
