public class LibraryTest {
    public static void main(String[] args) {
        Student student = new Student();
        
        // Borrowing a Book
        LibraryResource book = new Book();
        student.borrow(book, "The Great Gatsby");
        
        // Borrowing a Journal
        LibraryResource journal = new Journal("Nature Portfolio");
        student.borrow(journal, "Nature Portfolio");
    }
}