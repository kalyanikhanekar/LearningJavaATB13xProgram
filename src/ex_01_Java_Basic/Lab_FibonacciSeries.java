package ex_01_Java_Basic;

public class Lab_FibonacciSeries {
    //0, 1, 1, 2, 3, 5, 8, 13, 21, and so on.
    public static void main(String[] args) {
        int n=20;

        int i=0;
        int j=1;
        int k;
        System.out.print(i+"  "+j);
        n=n-2;
        while(n!=0) {

            k = i + j;
            i = j;
            j = k;

            System.out.print("  " + k);
            n--;
        }

        }
    }

