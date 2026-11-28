package modificators;

public class LibraryTest {
    void print() {
        Library bookOne = new Library();
        bookOne.author = "BookOne";
        bookOne.category = "BookOne";
        bookOne.year = 1999;

        String title = bookOne.getBookTitle();
    }
}
