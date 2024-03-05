package PL3;
public class Main {
    public static void main(String[] args) {
        PieceWorker pw = new PieceWorker("Jorge Silva", 53, 62);
        CommissionWorker cw = new CommissionWorker("Susana Ferreira", 650, 57, 89);
        HourlyWorker hw = new HourlyWorker();

        Object[] arr = new Object[10];
        arr[0] = pw;
        arr[1] = cw;
        arr[2] = hw;
    }
    private static void listing1(Object[] arr) {
        System.out.println("--------------all workers--------------");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i].toString());
        }
    }
    private static void listing2(Object[] arr) {
        System.out.println("--------------hourly workers--------------");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] instanceof HourlyWorker)
                System.out.println(arr[i].toString());
        }
    }
    private static void listing3(Object[] arr) {
        System.out.println("--------------name + salary--------------");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != null)
                System.out.printf("%s : %.2f", ((Worker)arr[i]).getName(), ((Worker)arr[i]).calculateSalary());
        }
    }
}
