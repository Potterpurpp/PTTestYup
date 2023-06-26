import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("What is your fav kind of animal");
            System.out.println("1. Carnivor\n" +
                    "2. Herbivor\n" +
                    "3. Omnivor");
            int fav = sc.nextInt();
            if(fav==1){
                Carnivor c1 = new Carnivor();
                c1.setBeef();
            }
            else if(fav==2){
                Herbivor h1 = new Herbivor();
                h1.setBrocoli();
            }
            else{
                Omnivor o1 = new Omnivor();
                o1.setTofu();
            }
        }


    }
}