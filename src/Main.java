public class Main {
    public static void main(String[] args) {

        Book book1 = new Book("Maly Ksiaze", "Antoine de Saint-Exupéry", "43212345", true, "");
        Book book2 = new Book("1984", "George Orwell", "65432298", true, "");
        Book book3 = new Book("The Hunger Games Trilogy", "Suzanne Collins", "7654896", true, "");

        Ebook eb1 = new Ebook("Maly Ksiaze", "Antoine de Saint-Exupéry", "32434324", true, 35.2, "E-Book");
        Ebook eb2 = new Ebook("1984", "George Orwell", "6748554", true, 15.2, "E-Book");
        Ebook eb3 = new Ebook("The Hunger Games Trilogy", "Suzanne Collins", "76534784", true, 85.3, "E-Book");

        AudioBook ab1 = new AudioBook("Maly Ksiaze", "Antoine de Saint-Exupéry", "32434324", true, 5.3, 185.2, "AudioBook");
        AudioBook ab2 = new AudioBook("1984", "George Orwell", "6748554", true, 4.9, 222.5, "AudioBook");
        AudioBook ab3 = new AudioBook("The Hunger Games Trilogy", "Suzanne Collins", "76534784", true, 22.4, 532.5, "AudioBook");

        book1.displayInfo();
        book2.displayInfo();
        book3.displayInfo();

        eb1.displayInfo();
        eb2.displayInfo();
        eb3.displayInfo();

        ab1.displayInfo();
        ab2.displayInfo();
        ab3.displayInfo();

        LibraryUser user1 = new LibraryUser("Max", "0001");

        System.out.println("--- AudioBook History ---");
        user1.displayOnlyAudiobooks();

        System.out.println("--- Borrowing ---");
        user1.borrowBook(book1); //Borrow
        user1.borrowBook(eb1); //Borrow
        user1.borrowBook(book3); //Borrow
        user1.borrowBook(book1); //Alr borrowed err
        user1.borrowBook(ab2);

        System.out.println("--- Ebook History ---");
        user1.displayOnlyEbooks();

        System.out.println("--- AudioBook History ---");
        user1.displayOnlyAudiobooks();

        System.out.println("--- Borrowed books ---");
        user1.displayBorrowedBooks();

        System.out.println("--- Additional AudioBook borrow ---");
        user1.borrowBook(ab3);

        System.out.println("--- AudioBook History ---");
        user1.displayOnlyAudiobooks();

        System.out.println("--- Returning ---");
        user1.returnBook(book1); //Return
        user1.returnBook(book1); //Alr returned err
        user1.returnBook(eb3);

        System.out.println("--- Borrowed books ---");
        user1.displayBorrowedBooks();

        System.out.println("--- History of borrowing ---");
        user1.historicalBorrowedBooks();
    }
}
