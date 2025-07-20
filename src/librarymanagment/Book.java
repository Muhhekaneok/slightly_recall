package librarymanagment;

public class Book implements Borrowable {
    int id;
    String title;
    String author;
    boolean isAvailable;

    public Book(int id, String title, String author, boolean isAvailable) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.isAvailable = isAvailable;
    }

    @Override
    public void borrowBook() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("Book " + title + " has been borrowed");
        }
        else
            System.out.println("Book " + title + " is currently unavailable");

    }

    @Override
    public String toString() {
        return "Book{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", isAvailable=" + isAvailable +
                '}';
    }
}