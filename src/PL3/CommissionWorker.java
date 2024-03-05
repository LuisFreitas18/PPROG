package PL3;
public class CommissionWorker extends Worker {

    private float baseSalary;
    private float salesValue;
    private float commissionPercentage;

    private static final float DEFAULT_BASE_SALARY = 635.0f;
    private static final float DEFAULT_SALES_VALUE = 0;
    private static final float DEFAULT_COMMISSION_PERCENTAGE = 0;

    public CommissionWorker(String name, float baseSalary, float sales, float commision) {
        super(name);
        this.baseSalary = baseSalary;
        this.salesValue = sales;
        this.commissionPercentage = commision;
    }

    public CommissionWorker(String name) {
        super(name);
        baseSalary = DEFAULT_BASE_SALARY;
        salesValue = DEFAULT_SALES_VALUE;
        commissionPercentage = DEFAULT_COMMISSION_PERCENTAGE;
    }

    public CommissionWorker() {
        super();
        baseSalary = DEFAULT_BASE_SALARY;
        salesValue = DEFAULT_SALES_VALUE;
        commissionPercentage = DEFAULT_COMMISSION_PERCENTAGE;
    }

    public float getBaseSalary() {
        return baseSalary;
    }

    public float getSalesValue() {
        return salesValue;
    }

    public float getCommissionPercentage() {
        return commissionPercentage;
    }

    public void setBaseSalary(float baseSalary) {
        this.baseSalary = baseSalary;
    }

    public void setSalesValue(float salesValue) {
        this.salesValue = salesValue;
    }

    public void setCommissionPercentage(float commissionPercentage) {
        this.commissionPercentage = commissionPercentage;
    }

    @Override
    public String toString() {
        return String.format("Commission worker: %s "
                        + "%nBase salary: %.2f Euros "
                        + "%nSales: %.2f Euros "
                        + "%nCommission: %.1f%%",
                super.toString(), baseSalary, salesValue, commissionPercentage);
    }

    public float calculateSalary() {
        return baseSalary + salesValue * (commissionPercentage / 100);
    }

}

