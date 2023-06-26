package Company;

public class Senior extends Role{

    public Senior(String name, int age) {
        super(name, age);
    }

    @Override
    public String task() {
        return "Write real website";
    }
    @Override
    public void displayAll() {
        super.displayAll();
        task();
    }
}
