package ex_01_Java_Basic;

public class Lab024_TryWithoutCatch {
    public static void main(String[] args) {
        try {
            System.out.println("Inside try block");
            int result = 10 / 0; // This will cause an ArithmeticException
            System.out.println("This line will not be reached");
        } finally {
            System.out.println("Inside finally block");
        }
    }
}
