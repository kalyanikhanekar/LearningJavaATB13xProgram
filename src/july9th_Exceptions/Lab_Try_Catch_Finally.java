package july9th_Exceptions;

import java.util.Scanner;

public class Lab_Try_Catch_Finally {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       int a= sc.nextInt();
       int b=sc.nextInt();
       try{
           int c=a/b;

       }catch (ArithmeticException e){
           System.out.println(e.getMessage());
       }finally {
           sc.close();
           System.out.println("scanner closed");
       }
    }

}
