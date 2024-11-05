public class Book {
    private String title;
    private String author;
    private String isbn;
    private boolean isAvailable;

    //Getters
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getIsbn() {
        return isbn;
    }

    public boolean getAvailability() {
        return isAvailable;
    }

    //Setters
    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    //No setter for availability - fully controlled by borrowing and returning

    public Book(String title, String author, String isbn, boolean isAvailable) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.isAvailable = isAvailable;
    }
    public boolean borrow() {
        if(isAvailable) {
            isAvailable = false;
            System.out.println("Successfully borrowed [" + title + " by " + author + "]");
            return true;
        } else {
            System.out.println("Book [" + title + " by " + author + "] is already borrowed!");
            return false;
        }
    }

    public boolean returnBook() {
        if(isAvailable) {
            System.out.println("Book [" + title + " by " + author + "] is not borrowed!");
            return false;
        } else {
            isAvailable = true;
            System.out.println("Successfully returned [" + title + " by " + author + "]");
            return true;
        }
    }

    public void displayInfo() {
        System.out.println("----------------------------\n" +
                "Title: " + title + "\nAuthor: " + author + "\nISBN: " + isbn + "\nAvailable: " + isAvailable
        + "\n----------------------------"
        );
    }
}
