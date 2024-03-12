package PL4.school;

public class Main {
    public static void main(String[] args) {
        Person[] arr = new Person[10];
        arr[0] = new Professor("Ana", 1, "Assistant");
        arr[1] = new Professor("Berta", 2, "Coordinator");
        arr[2] = new Student("Carla", 3, 3);
        arr[3] = new FellowshipStudent("Diogo", 5, 4, 2000);
        listing1(arr);
        listing2(arr);
        listing3(arr);
        listing4(arr);
        listing5(arr);
    }
    private static void listing1(Person[] arr) {
        System.out.println("--------all persons");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null) {
                System.out.println(arr[i]);
            }
        }
        System.out.println();
    }
    private static void listing2(Person[] arr) {
        System.out.println("--------Professors");
        for (Person p : arr) {
            if (p instanceof Professor) {
                System.out.println(p.getName() + " - " + ((Professor)p).getCategory());
            }
        }
        System.out.println();
    }
    private static void listing3(Person[] arr) {
        System.out.println("--------(Non Fellow) Student mecNumber");
        for (Person p : arr) {
            if (p != null && p.getClass() == Student.class ) {
                System.out.println(p.getName() + " - " + ((Student)p).getMecNumber());
            }
        }
        System.out.println();
    }
    private static void listing4(Person[] arr) {
        System.out.println("--------class names");
        for (Person p : arr) {
            if (p != null) {
                System.out.println(p.getName() + " - " + p.getClass());
            }
        }
        System.out.println();
    }
    private static void listing5(Person[] arr) {
        System.out.println("--------Professor Salaries");
        for (Person p : arr) {
            //this way bellow is independent of which one is (Prof or Fellowship), you cannot cast Professor if it's a Fellowship and vice-versa
            if (p instanceof iSalary) {
                System.out.println(p.getName() + " - " + ((iSalary)p).getSalary());
            }
        }
        System.out.println();
    }
}
