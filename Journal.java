public class Journal implements LibraryResource {
    private String title;

    // Add this constructor
    public Journal(String title) {
        this.title = title;
    }

    @Override
    public void borrowResource(String title) {
        System.out.println("Journal title: " + this.title + " is being processed."); 
    }
}