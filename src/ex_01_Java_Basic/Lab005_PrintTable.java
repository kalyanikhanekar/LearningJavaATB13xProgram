package ex_01_Java_Basic;

import java.util.Scanner;

public class Lab005_PrintTable {

    public static void main(String[] args) {
    /* Print  lines of output; each line  (where ) contains the  of  in the form:
    N x i = result.
    */
        int n;
        //Take input from user
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the table number ");
        n=sc.nextInt();

        for(int i=1;i<=10;i++){

            System.out.println(n+" * "+i+" = "+n*i);
        }

    }
}
