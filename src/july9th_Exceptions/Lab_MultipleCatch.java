package july9th_Exceptions;

public class Lab_MultipleCatch {
    public static void main(String[] args) {
        int a = 230;
        int b = 0;
        int d[] = {4, 6, 5, 2};
        try {
            int e = d[4];
            int c = a / b;


        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }

        System.out.println("this is executed");
    }
}
