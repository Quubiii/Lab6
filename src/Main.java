public class Main {
    public static void main(String[] args) {

        Book book1 = new Book("Maly Ksiaze", "Antoine de Saint-Exupéry", "43212345", true);
        Book book2 = new Book("1984", "George Orwell", "65432298", true);
        Book book3 = new Book("The Hunger Games Trilogy", "Suzanne Collins", "7654896", true);

        book1.displayInfo();
        book2.displayInfo();
        book3.displayInfo();

        LibraryUser user1 = new LibraryUser("Max", "0001");

        System.out.println("--- Borrowing ---");
        user1.borrowBook(book1); //Borrow
        user1.borrowBook(book3); //Borrow
        user1.borrowBook(book1); //Alr borrowed err

        System.out.println("--- Borrowed books ---");
        user1.displayBorrowedBooks();

        System.out.println("--- Returning ---");
        user1.returnBook(book1); //Return
        user1.returnBook(book1); //Alr returned err

        System.out.println("--- Borrowed books ---");
        user1.displayBorrowedBooks();
    }
}
