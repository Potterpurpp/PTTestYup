package Company;

public class Senior extends Role{

    /**
     * <img src="../check-pass.png">
     */
    public Senior(String name, int age) {
        super(name, age);
    }

    /**
     * <img src="../check-pass.png">
     */
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
