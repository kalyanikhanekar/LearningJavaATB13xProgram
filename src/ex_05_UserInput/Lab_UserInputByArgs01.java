package ex_05_UserInput;

public class Lab_UserInputByArgs01 {

    public static void main(String[] args) {

        int a=Integer.parseInt(args[0]);
        int b=Integer.parseInt(args[1]);

        int c=a+b;
        System.out.println("Sum is "+c);

    }
}

