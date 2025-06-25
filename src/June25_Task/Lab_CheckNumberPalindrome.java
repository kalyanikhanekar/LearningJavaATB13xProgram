package June25_Task;

import java.util.Scanner;

public class Lab_CheckNumberPalindrome {
    public static void main(String[] args) {

        int num;
        System.out.println("Enter the number");
        Scanner sc=new Scanner(System.in);
        num=sc.nextInt();
       // System.out.println(num%10);
       // System.out.println(num/10);
        int original=num;
       int rem=0;
       int rev=0;
        while(num!=0){
            rem=num%10;
            rev=rev*10 + rem;
            num=num/10;
        }
        if(original==rev){
            System.out.println("Palindrome  "+original);
        }else{
            System.out.println("Not Palindrome "+original);
        }


    }
}
