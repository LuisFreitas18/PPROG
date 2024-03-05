package PL2;

public class MainUser {
    public static void main(String[] args) {
        User[] arr = new User[5];
        arr[0] = new User();
        arr[1] = new User("Ana", 11);
        arr[2] = new User("Berta", "M", 22, 1.67, 56);
        for (User value : arr) {
            if (value != null) {
                System.out.println(value);
            }
        }
        /** equals to this:
         *         for (int user = 0; user < arr.length; user++) {
         *             if (arr[user] != null) {
         *                 System.out.println(arr[user]);
         *             }
         *         }
         */
        for (User user:arr){
            if (arr[user.getAge()] != null)
                System.out.println(user.getName()+ " "+ user.getBMI()+ " ");
        }
        for (User user:arr){
            if (user !=null && !user.getObesityDegree().equals(User.getHealthy()))
                System.out.println(user.getName()+ " " +user.getObesityDegree());
        }
        User.setBMI_LIMIT1(100);
        User.setBMI_LIMIT2(200);

        arr[0].setAge(arr[2].getAge());

        User result = arr[0].theYoungest(arr[1]);
        if (result == null)
            System.out.println("same age");
        else
            System.out.println("younger" + result);

    }
}
