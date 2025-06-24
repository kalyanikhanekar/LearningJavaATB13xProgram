package June24_Task;

import java.util.Scanner;

public class SmallestOfThreeNumber {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("enter the numbers a b  and c ");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();


        int small=(a<b&&a<c)?a:(b<c&&b<a?b:c);

        System.out.println("Smallest number is  "+small);

    }
}
