package Company;

public abstract class Role {
    /**
     * <img src="../check-pass.png">
     */
    private String name;
    private int age;

    /**
     * <img src="../check-pass.png">
     */
    public Role(String name,int age){
        this.name=name;
        this.age=age;
    }

    /**
     * <img src="../check-pass.png">
     */
    public abstract String task();

    /**
     * <img src="../check-pass.png">
     */
    public void displayAll(){
        System.out.println("Here is your name: "+this.name);
        System.out.println("Here is age: "+this.age);
    }
}
