import java.util.ArrayList;

public class LibraryUser {
    private String name;
    private String userId;
    private ArrayList<Book> borrowedBooks;

    //Getters
    public String getName() {
        return name;
    }

    public String getUserId() {
        return userId;
    }

    public ArrayList<Book> getBorrowedBooks() {
        return new ArrayList<>(borrowedBooks);
    }

    //Setters
    public void setName(String name) {
        if(name != null) {
            this.name = name;
        }
    }

    public void setUserId(String userId) {
        if(userId != null) {
            this.userId = userId;
        }
    }

    //No setter for arraylist of books - fully controlled by borrowing and returning

    public LibraryUser(String name, String userId) {
        this.name = name;
        this.userId = userId;
        this.borrowedBooks = new ArrayList<>();
    }

    public void borrowBook(Book book) {
        if(book.borrow()) {
            borrowedBooks.add(book);
        }
    }

    public void returnBook(Book book) {
        if(book.returnBook()) {
            borrowedBooks.remove(book);
        }
    }

    public void displayBorrowedBooks() {
        ArrayList<String> titles = new ArrayList<>();
        for(Book book : borrowedBooks) {
            titles.add(book.getTitle());
        }
        System.out.println("Currently borrowed books:\n" + titles);
    }
}
