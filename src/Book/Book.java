package Book;

public abstract class Book {
    private String title;
    private String author;
    private int ISBN;

   public Book(String title, String author, int ISBN){
       this.author = author;
       this.title = title;
       this.ISBN = ISBN;
   }
   public void displayBook(){
       System.out.println("Author is "+this.author);
       System.out.println("Title is "+this.title);
       System.out.println("ISBN is "+this.ISBN);
   }
}
