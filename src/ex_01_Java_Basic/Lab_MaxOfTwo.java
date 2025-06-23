package ex_01_Java_Basic;

import java.util.Scanner;

public class Lab_MaxOfTwo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();

        int b=sc.nextInt();
        System.out.println("Number entered "+a+" "+b);
        if(a>b){
            System.out.println("Max is "+a);
        }else{
            System.out.println("Max is "+b);
        }
    }
}
