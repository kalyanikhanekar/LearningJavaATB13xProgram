package July3rd_polymorphism;

import java.util.Scanner;

public class Lab_AddTwoNumbers {


    public static void main(String[] args) {
        int a;
        int b;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter values");
       a= sc.nextInt();
       b=sc.nextInt();
       double c=sc.nextDouble();
       double d=sc.nextDouble();
       Addition add=new Addition();
       int result=add.add(a,b);
        System.out.println("Integer Result   "+result);
       double result1=add.add(c,d);
        System.out.println("Double Result   "+result1);
    }
}

class Addition{

   int add(int a,int b){
       int addition=0;
       addition=a+b;
      return addition;
    }
   double add(double a,double b){
       double addition=0;
       addition=a+b;
       return addition;

   }

}