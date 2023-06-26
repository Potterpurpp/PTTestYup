package Company;

import java.util.Scanner;

public class CompanyMain {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What do you want to apply\n" +
                "1. Intern\n" +
                "2. Junior\n" +
                "3. Senior");
        int x = sc.nextInt();
        if(x==1){
            System.out.println("Input your name: ");
            String name = sc.next();
            System.out.println("Input your age: ");
            int age = sc.nextInt();
            Intern i1 = new Intern(name,age);
            i1.displayAll();
            i1.task();
        }
        else if(x==2){
            System.out.println("Input your name: ");
            String name = sc.next();
            System.out.println("Input your age: ");
            int age = sc.nextInt();
            Junior i1 = new Junior(name,age);
        } else if(x==3){
            System.out.println("Input your name: ");
            String name = sc.next();
            System.out.println("Input your age: ");
            int age = sc.nextInt();
            Senior i1 = new Senior(name,age);
        }
    }
}
