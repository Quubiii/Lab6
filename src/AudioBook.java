public class AudioBook extends Book{
    private double fileSizeMB;
    private double duration;
    private String type;

    public AudioBook(String title, String author, String isbn, boolean isAvailable, double fileSizeMB, double duration, String type) {
        super(title, author, isbn, isAvailable, type);
        this.fileSizeMB = fileSizeMB;
        this.duration = duration;
        this.type = type;
    }

    //Getters
    public double getFileSizeMB() {
        return fileSizeMB;
    }

    public double getDuration() {
        return duration;
    }

    public String getType() {
        return type;
    }

    //Setters
    public void setFileSizeMB(double fileSizeMB) {
        this.fileSizeMB = fileSizeMB;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    public void displayInfo() {
        System.out.println("----------------------------\n" +
                "Title: " + super.getTitle() + " " + type + "\nAuthor: " + super.getAuthor() + "\nISBN: " + super.getIsbn()+ "\nAvailable: " + super.getAvailability() + "\nFile size [MB]: " + fileSizeMB + "\nDuration [Min]: " + duration
                + "\n----------------------------"
        );
    }
}
