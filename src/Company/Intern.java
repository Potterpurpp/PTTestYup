package Company;

public class Intern extends Role{

    public Intern(String name, int age) {
        super(name, age);
    }

    @Override
    public String task() {
        return "print document";
    }
    @Override
    public void displayAll() {
        super.displayAll();

    }
}
