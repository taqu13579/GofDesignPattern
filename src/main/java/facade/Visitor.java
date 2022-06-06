package facade;

public class Visitor {
    public static void main(String[] args) {
        Librarian librarian = new Librarian();
        String location = librarian.searchBook("BookTitle");
        System.out.println(location);
    }
}
