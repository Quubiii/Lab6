public class Ebook extends Book {
    private double fileSizeMB;

    public Ebook(String title, String author, String isbn, boolean isAvailable, double fileSizeMB) {
        super(title, author, isbn, isAvailable);
        this.fileSizeMB = fileSizeMB;
    }

    //Getter
    public double getFileSizeMB() {
        return fileSizeMB;
    }

    //Setter
    public void setFileSizeMB(double fileSizeMB) {
        this.fileSizeMB = fileSizeMB;
    }

    public void displayInfo() {
        super.displayInfo();
        System.out.println("File size: " + fileSizeMB);
    }
}