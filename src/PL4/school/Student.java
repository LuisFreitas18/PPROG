package PL4.school;

public class Student extends Person{

    private int mecNumber;

    public Student(String name, int id, int mecNumber) {
        super(name, id);
        this.mecNumber = mecNumber;
    }

    public int getMecNumber() {
        return mecNumber;
    }

    public void setMecNumber(int mecNumber) {
        this.mecNumber = mecNumber;
    }

    @Override
    public String toString() {
        return "Student{" +
                super.toString() +
                "mecNumber=" + mecNumber +
                '}';
    }
}
