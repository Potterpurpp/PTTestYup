package Company;

public class Junior extends Role{


    public Junior(String name, int age) {
        super(name, age);
    }

    @Override
    public String task() {
        return "Fix bug programming";
    }

    @Override
    public void displayAll() {
        super.displayAll();
        task();
    }
}
