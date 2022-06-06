package facade;


public class Librarian {
    public String searchBook(String bookName) {
        BookList bookList = new BookList();
        String location = bookList.searchBook(bookName);

        if (location != null) {
            LendingList lendingList = new LendingList();
            if (lendingList.check(bookName)) {
                return "貸し出し中";
            } else {
                return location;
            }
        } else {
            return "その本はありません";
        }
    }
}
