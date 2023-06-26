package Book;

public class Fantasy extends Book{
    public Fantasy(String title, String author, int ISBN) {
        super(title, author, ISBN);
    }

    @Override
    public void displayBook() {
        super.displayBook();
    }
    public void setDesp(){
        System.out.println("Here is fantasy");
    }

}
