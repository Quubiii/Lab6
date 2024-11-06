import java.util.ArrayList;

public class LibraryUser {
    private String name;
    private String userId;
    private ArrayList<Book> borrowedBooks;
    private ArrayList<Book> history;
    private ArrayList<Book> AudiobookHistory;
    private ArrayList<Book> EbookHistory;

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

    public ArrayList<Book> getHistory() {
        return new ArrayList<>(history);
    }

    public ArrayList<Book> getAudiobookHistory() {
        return AudiobookHistory;
    }

    public ArrayList<Book> getEbookHistory() {
        return EbookHistory;
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
        this.history = new ArrayList<>();
        this.AudiobookHistory = new ArrayList<>();
        this.EbookHistory = new ArrayList<>();
    }

    public void borrowBook(Book book) {
        if(book.borrow()) {
            borrowedBooks.add(book);
            history.add(book);
            if(book.getType().equalsIgnoreCase("audiobook")) {
                AudiobookHistory.add(book);
            } else if(book.getType().equalsIgnoreCase("E-book")) {
                EbookHistory.add(book);
            }
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
            titles.add(book.getTitle() + " " + book.getType());
        }
        System.out.println("Currently borrowed books:\n" + titles);
    }

    public void historicalBorrowedBooks() {
        ArrayList<String> titles = new ArrayList<>();
        if (!history.isEmpty()) {
            for(Book book : history) {
                titles.add(book.getTitle() + " " + book.getType());
            }
        }
        System.out.println(titles);
    }

    public void displayOnlyAudiobooks() {
        ArrayList<String> titles = new ArrayList<>();
        if(!AudiobookHistory.isEmpty()) {
            for(Book book : getAudiobookHistory()) {
                titles.add(book.getTitle());
            }
            System.out.println(titles);
        } else {
            System.out.println("You haven't ever borrowed any AudioBook.");
        }
    }

    public void displayOnlyEbooks() {
        ArrayList<String> titles = new ArrayList<>();
        if(!EbookHistory.isEmpty()) {
            for(Book book : getEbookHistory()) {
                titles.add(book.getTitle());
            }
            System.out.println(titles);
        } else {
            System.out.println("You haven't ever borrowed any Ebook.");
        }
    }


}
