package ex_01_Java_Basic;

import java.util.Scanner;

public class Lab004_InputFromUser {
    public static void main(String[] args) {

        // Use Scanner class to take input
        Scanner sc=new Scanner(System.in);

        //Ask User to Enter data
        System.out.println("Enter the data in String format");
        String str;//create string variable to store the entered data;

        str=sc.nextLine();

        //Print the data on screen


        System.out.println("Entered data by user is ..........       "+str);




    }
}
