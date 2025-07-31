package july31_Task;

public class Lab_Amstrong_number {
    public static void main(String[] args) {
        int n = 123;//not  153 is amstrong
        int original = n;
        int total = 0;
        while (n > 0) {
            int cube = 0;
            int rem = n % 10;

            cube = rem * rem * rem;

            total = total + cube;

            n = n / 10;

        }

        if (original == total) {
            System.out.println("Amstrong number  " + original);
        } else {
            System.out.println("Not Amstrong Number  " + original);
        }
    }
}
