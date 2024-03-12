package PL4.school;

public class Professor extends Person implements iSalary{
    private String category;
    private static final String ASSISTANT = "Assistant";
    private static final String ADJUNCT = "Adjunct";
    private static final String COORDINATOR = "Coordinate";
    private static final String CATEGORY_DEFAULT = ASSISTANT;
    private static final double BASE_SALARY = 1500;
    private static double percentageAdjunct = 0.2;
    private static double percentageCoordinator = 0.5;

//Constructor
    public Professor(String name, int id, String category) {
        super(name, id);
        this.category = category;
    }
    public Professor(String name, int id) {
        super(name, id);
        this.category = CATEGORY_DEFAULT;
    }
//Getters and Setters
    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public static double getPercentageAdjunct() {
        return percentageAdjunct;
    }

    public static void setPercentageAdjunct(double percentageAdjunct) {
        Professor.percentageAdjunct = percentageAdjunct;
    }

    public static double getPercentageCoordinator() {
        return percentageCoordinator;
    }

    public static void setPercentageCoordinator(double percentageCoordinator) {
        Professor.percentageCoordinator = percentageCoordinator;
    }
//To String
    @Override
    public String toString() {
        return "Professor{" +
                super.toString() +
                "category='" + category + '\'' +
                '}';
    }
//Interface
    @Override
    public double getSalary() {
        if (category.equals(ADJUNCT))
            return BASE_SALARY * (1 + percentageAdjunct);
        else if (category.equals(COORDINATOR))
            return BASE_SALARY * (1 + percentageCoordinator);

        return BASE_SALARY;
    }

}
