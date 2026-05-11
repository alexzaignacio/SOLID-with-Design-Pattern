public class Student {
    // High-level module depending on abstraction
    public void borrow(LibraryResource resource, String title) {
        resource.borrowResource(title); 
    }
}