package ex_01_Java_Basic;

import java.util.Scanner;

public class Lab_FactorialOfNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int fact = 1;
        if (n < 0) {
            System.out.println(fact);
        } else {
            for (int i = 1; i <= n; i++) {
                fact = fact * i;
            }
            System.out.println("Factorial of " + n + " is " + fact);
        }
    }
}
