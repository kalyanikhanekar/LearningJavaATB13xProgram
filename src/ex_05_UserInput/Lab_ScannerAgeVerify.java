package ex_05_UserInput;

import java.util.Scanner;

public class Lab_ScannerAgeVerify {
    public static void main(String[] args) {

        System.out.println("Enter the age");
        Scanner sc=new Scanner(System.in);
        int age=sc.nextInt();

        if (age>=18){
            System.out.println("User can Vote");
        }else{
            System.out.println("User can not Vote");
        }

    }
}
