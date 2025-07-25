package july25th_Task;

import java.util.Scanner;

public class Lab_fibonacci {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        System.out.println("Enter the n");
        int n=sc.nextInt();

        System.out.println();
        int a=1;
        int b=1;
        int c=0;
        System.out.print(a+"  "+b+"   ");
        for(int i=1;i<n;i++){
            c=a+b;
            a=b;b=c;
            System.out.print(c+ "  ");
        }


    }
}
