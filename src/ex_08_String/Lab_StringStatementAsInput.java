package ex_08_String;

import java.util.Scanner;

public class Lab_StringStatementAsInput {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the string statement");

        String str=sc.nextLine();

        System.out.println(str);
    }
}
