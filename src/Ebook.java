public class Ebook extends Book {
    private double fileSizeMB;
    private String type;

    public Ebook(String title, String author, String isbn, boolean isAvailable, double fileSizeMB, String type) {
        super(title, author, isbn, isAvailable, type);
        this.fileSizeMB = fileSizeMB;
        this.type = type;
    }

    //Getter
    public double getFileSizeMB() {
        return fileSizeMB;
    }

    public String getType() {
        return type;
    }

    //Setter
    public void setFileSizeMB(double fileSizeMB) {
        this.fileSizeMB = fileSizeMB;
    }

    public void displayInfo() {
        System.out.println("----------------------------\n" +
                "Title: " + super.getTitle() + " " + type + "\nAuthor: " + super.getAuthor() + "\nISBN: " + super.getIsbn()+ "\nAvailable: " + super.getAvailability() + "\nFile size [MB]: " + fileSizeMB
                + "\n----------------------------"
        );
    }
}