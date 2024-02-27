public class User {
    //attributes (private)
    private String name;
    private String gender;
    private int age;
    private double height;
    private double weight;

    private final String DEFAULT_NAME = "anonymous";
    private final String DEFAULT_GENDER = "undefined";
    private final int DEFAULT_AGE = 0;
    private final double DEFAULT_HEIGHT = 0;
    private final double DEFAULT_WEIGHT = 0;

    private final String[] OBESITY_MESSAGE = {"Thin", "Healthy", "Obesity"};
    private static int BMI_LIMIT1 = 18;     //not final, can be changed (has setter)
    private static int BMI_LIMIT2 = 25;     //static, because is the same for every user, not unique to a user

    public static int numberOfUsers = 0;

    //methods (public)

    //constructors

    /**
     *  public User() { //redirect the constructor to the one below using given parameters
     *      this (DEFAULT_NAME, DEFAULT_GENDER, DEFAULT_AGE, DEFAULT_HEIGHT, DEFAULT_WEIGHT);
     *  }
    */ 

    public User() {
        name = DEFAULT_NAME;
        gender = DEFAULT_GENDER;
        age = DEFAULT_AGE;
        height = DEFAULT_HEIGHT;
        weight = DEFAULT_WEIGHT;
    }
    public User(String name, int age) {
        this.name = name;
        gender = DEFAULT_GENDER;
        this.age = age;
        height = DEFAULT_HEIGHT;
        weight = DEFAULT_WEIGHT;
        numberOfUsers++;
    }

    /**
     *
     * @param name
     * @param gender
     * @param age
     * @param height
     * @param weight
     */
    public User(String name, String gender, int age, double height, double weight) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.height = height;
        this.weight = weight;
        numberOfUsers++;
    }

    //getters

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }

    public double getHeight() {
        return height;
    }

    public double getWeight() {
        return weight;
    }

    //setters
    public void setName(String name) {
        this.name = name;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public static void setBMI_LIMIT1(int bmi_limit1New) { //cannot use "this", because it's a static
        BMI_LIMIT1 = bmi_limit1New;
    }

    public static void setBMI_LIMIT2(int bmi_limit2New) {
        BMI_LIMIT2 = bmi_limit2New;
    }

    //toString

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", age=" + age +
                ", height=" + height +
                ", weight=" + weight +
                '}';
    }

    //other
    public int getAgeDifference(User otherUser) {
        return Math.abs(this.age - otherUser.age);
    }
    //instance one ^
    public static int getAgeDifference(User user1, User user2) {
        return Math.abs(user1.age - user2.getAge());
    }
    //normal class method, not related to instance (static) ^

    public double getBMI() {
        return weight/(height * height);
    }
    public String getObesityDegree() {
        double bmi = getBMI();
        if (bmi < BMI_LIMIT1) {
            return OBESITY_MESSAGE[0];
        } else if (bmi <= BMI_LIMIT2) {
            return OBESITY_MESSAGE[1];
        } else {
            return OBESITY_MESSAGE[2];
        }
    }

    public boolean isHealthy() {
        return getObesityDegree().equals(OBESITY_MESSAGE[1]);
    }

    public User theYoungest(User otherUser) {
        if (this.age == otherUser.age)
            return null;
        if (this.age < otherUser.age)
            return this;
        return otherUser;
    }
}
