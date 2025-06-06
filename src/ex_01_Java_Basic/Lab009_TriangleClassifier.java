package ex_01_Java_Basic;

import java.util.Scanner;

/*
Write a program that classifies a triangle based on its side lengths.
Given three input values representing the lengths of the sides,
determine if the triangle is equilateral (all sides are equal),
isosceles (exactly two sides are equal), or scalene (no sides are equal).
Use an if-else statement to classify the triangle.
 */
public class Lab009_TriangleClassifier {

    public static void main(String[] args) {
        //Take 3 sides as a input from user
       Scanner sc=new Scanner(System.in);

       int a;
       int b;
       int c;
        System.out.println("Enter the length of 3 sides of triangle");
        a=sc.nextInt();
        b=sc.nextInt();
        c=sc.nextInt();

        if(a==b&&a==c&&b==c){
            System.out.println("The Triangle is Equilateral Triangle");
        }
        else if(a==b || b==c ||a==c){
            System.out.println("The Triangle is isosceles Triangle");
        }else{
            System.out.println("The Triangle is scalene triangle");
        }

    }
}
