package modificators;

public class Library {
    private String bookTitle;
    protected String author;
    int year;
    public String category;

    String getBookTitle() {
        return this.bookTitle;
    }

    String getAuthor() {
        return this.author;
    }

    int getYear() {
        return this.year;
    }

    String getCategory() {
        return this.category;
    }

    void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    void setAuthor(String author) {
        this.author = author;
    }

    void setYear(int year) {
        this.year = year;
    }

    void setCategory(String category) {
        this.category = category;
    }
}
