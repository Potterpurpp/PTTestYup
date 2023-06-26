package Company;

public abstract class Role {
    private String name;
    private int age;
    public Role(String name,int age){
        this.name=name;
        this.age=age;
    }
    public abstract String task();
    public void displayAll(){
        System.out.println("Here is your name: "+this.name);
        System.out.println("Here is age: "+this.age);
    }
}
