package task1;

public class Book {
    private String title;
    private String author;
    private int year;
    private boolean isAvailable;
    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.isAvailable = true;
    }

    public void borrow(){
        if(isAvailable){
            isAvailable = false;
            System.out.println("task1.Book has been borrowed. " + title);
        } else {
            System.out.println("task1.Book hasn't been borrowed. " + title);
        }
    }

    public void returnBook() {
        if (!isAvailable) {
            isAvailable = true;
            System.out.println("You have returned: " + title);
        } else {
            System.out.println(title + " was not borrowed.");
        }
    }

    public String getTitle() {
        return title;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    @Override
    public String toString() {
        return title + " " + author + " " + year;
    }
}
