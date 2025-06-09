package ex_01_Java_Basic;

import java.util.Scanner;

public class Lab014_PrimeNumber {
    public static void main(String[] args) {
        int n;
        //taking input from user

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        n=sc.nextInt();
        int i;
        for(i=2;i<n;i++){
            if(n%i==0||n%3==0||n%5==0){
                System.out.println("Not Prime");
                break;
            }
        }

        if(n==i) {
            System.out.println(n+" is Prime Number");
        }

    }
}
