package Book;

public class Document extends Book{
    public Document(String title, String author, int ISBN) {
        super(title, author, ISBN);
    }

    @Override
    public void displayBook() {
        super.displayBook();
    }
    public void setDesp(){
        System.out.println("Here is document");
    }
}
