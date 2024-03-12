package PL4.school;

public class FellowshipStudent extends Student implements iSalary{
    private double scholarShip;

//Constructor
    public FellowshipStudent(String name, int id, int mecNumber, double scholarShip) {
        super(name, id, mecNumber);
        this.scholarShip = scholarShip;
    }
//Getters and Setters
    public double getScholarShip() {
        return scholarShip;
    }

    public void setScholarShip(double scholarShip) {
        this.scholarShip = scholarShip;
    }
//To String
    @Override
    public String toString() {
        return "FellowshipStudent{" +
                super.toString() +
                "scholarShip=" + scholarShip +
                '}';
    }
//Interface
    @Override
    public double getSalary() {
        return scholarShip;
    }
}
