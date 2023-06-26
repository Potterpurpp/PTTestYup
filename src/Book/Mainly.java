package Book;

public class Mainly {
    public static void main(String[] args) {
        Fantasy f1 = new Fantasy("Harry bomb","Potter",589555);
        f1.displayBook();
        f1.setDesp();
        System.out.println();
        Document d1 = new Document("Tiger vs dog","KayKung",555555);
        d1.displayBook();
        d1.setDesp();

    }
}
