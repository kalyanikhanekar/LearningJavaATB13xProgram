package ex_01_Java_Basic;

public class Lab035_SwapNumbers {
    public static void main(String[] args) {
        int a=23;
        int b=34;
        System.out.println("Before swapping a  and  b is "+a+" "+b);

        a=a+b;
        b=a-b;
        a=a-b;

        System.out.println("After swaping a and b is "+a+" "+b);

    }
}
