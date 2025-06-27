package June27th_Task;

import java.util.Scanner;

public class Lab_CheckNumDiviBy5and11 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number");
        int num=sc.nextInt();

        if(num%5==0&&num%11==0){
            System.out.println("Number "+num+" is divisible by 5 and 11");
            return;
        }
        if(num%5==0){
            System.out.println("Number  "+num+" is divisible by 5");
        }
        if(num%11==0){
            System.out.println("Number  "+num+" is divisible by 11");
        }

    }
}
