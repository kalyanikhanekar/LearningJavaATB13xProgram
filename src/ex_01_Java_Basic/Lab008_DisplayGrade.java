package ex_01_Java_Basic;

import java.util.Scanner;

/*
Write a program that calculates and displays the letter grade for a given
numerical score (e.g., A, B, C, D, or F) based on the following grading scale:
A: 90-100
B: 80-89
C: 70-79
D: 60-69
F: 0-59

 */
public class Lab008_DisplayGrade {
    public static void main(String[] args) {
        //Take score input from user
        int score;
        Scanner sc=new Scanner((System.in));
        System.out.println("Enter the score markes");
        score=sc.nextInt();
        if(score>=90&&score<=100){
            System.out.println("Grade A");
        }else if(score>=80&&score<=89){
            System.out.println("Grade B");
        }else if(score>=70&&score<=79){
            System.out.println("Grade C");
        }else if(score>=60&&score<=69){
            System.out.println("Grade D");
        }else {
            System.out.println("Fail");
        }
    }
}
