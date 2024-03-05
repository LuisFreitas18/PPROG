package PL3;
public class HourlyWorker extends Worker {

    private int numberOfHours;
    private float hourlyPayment;

    private static final int DEFAULT_NUMBER_OF_HOURS = 0;
    private static final int DEFAULT_HOURLY_PAYMENT = 10;

    public HourlyWorker(String name, int numberOfHours, float hourlyPayment) {
        super(name);
        this.numberOfHours = numberOfHours;
        this.hourlyPayment = hourlyPayment;
    }

    public HourlyWorker(String name) {
        super(name);
        numberOfHours = DEFAULT_NUMBER_OF_HOURS;
        hourlyPayment = DEFAULT_HOURLY_PAYMENT;
    }

    public HourlyWorker() {
        super();
        numberOfHours = DEFAULT_NUMBER_OF_HOURS;
        hourlyPayment = DEFAULT_HOURLY_PAYMENT;
    }

    public int getNumberOfHours() {
        return numberOfHours;
    }

    public float getHourlyPayment() {
        return hourlyPayment;
    }

    public void setNumberOfHours(int numberOfHours) {
        this.numberOfHours = numberOfHours;
    }

    public void setHourlyPayment(float hourlyPayment) {
        this.hourlyPayment = hourlyPayment;
    }

    @Override
    public String toString() {
        return String.format("Hourly worker: %s %n Number of working hours: "
                        + "%d %nHourly Payment: %.2f €",
                super.toString(), numberOfHours, hourlyPayment);
    }

    @Override
    public float calculateSalary() {
        return this.numberOfHours * this.hourlyPayment;
    }

}

