package PL3;
public abstract class Worker {

    private String name;

    private static final String DEFAULT_NAME = "without name";

    public Worker(String name) {
        this.name = name;
    }

    public Worker() {
        name = DEFAULT_NAME;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }

    public abstract float calculateSalary();
}
