package ex_01_Java_Basic;

import java.util.Scanner;

public class Lab_PyramidTriangle {
    public static void main(String[] args) {





        int n = 5; // number of rows
        int spc = n - 1; // initial space count
        int str = 1; // initial star count
        // loop to print the pyramid
        for (int i = 1; i <= n; i++) { //for lines
            for (int j = 1; j <= spc; j++) { // spaces
                System.out.print("\t");
            }
            spc--; // decrementing spaces,most imp step

            for (int k = 1; k <= str; k++) { // stars
                System.out.print("*\t");
            }
            str += 2; // incrementing stars,most imp step
            System.out.println();
        }
    }
}
