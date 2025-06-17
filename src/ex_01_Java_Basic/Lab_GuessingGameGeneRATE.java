package ex_01_Java_Basic;


import java.util.Random;
import java.util.Scanner;

public class Lab_GuessingGameGeneRATE
{
    public static void main(String[] args) {


        Random num=new Random();
        int n=num.nextInt(100)+1;

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the number between 1 to 100");
    int attempts=0;
        while(true){

            int guess=sc.nextInt();
            attempts++;

            if(guess>n){
                System.out.println("Too Bigggg");

            }
            else if(guess<n){
                System.out.println("Too smallll");
            }
            else {
                System.out.println("Correct guess !!!!!!!!!!!!!!  in  attempts "+attempts);
            }
        }





    }
}
