package ex_05_UserInput;

import java.util.Scanner;

public class Lab_UserInputByScannerClass {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the value for adding 2 numbers");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=a+b;
        System.out.println("Addition is "+c);
    }
}

