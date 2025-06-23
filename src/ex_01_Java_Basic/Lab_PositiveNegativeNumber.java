package ex_01_Java_Basic;

import java.util.Scanner;

public class Lab_PositiveNegativeNumber {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number ");
        int n=sc.nextInt();

        if(n>0){
            System.out.println("Positive Number");
        }else if(n<0){
            System.out.println("Negative");
        }else {
            System.out.println("Invalid Number input");
        }

    }
}
