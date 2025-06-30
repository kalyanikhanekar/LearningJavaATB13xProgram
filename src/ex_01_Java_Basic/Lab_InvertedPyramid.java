package ex_01_Java_Basic;

public class Lab_InvertedPyramid {



    public static void main(String[] args) {
        int n=5;
        int spc=1;
        int str=n*2;
        for (int i = 1; i <= n*2; i++) { //for lines
            for (int j = 1; j <= i; j++) { // spaces
                System.out.print("\t");
            }
            spc++; // decrementing spaces,most imp step

            for (int k = 0; k <= str; k++) { // stars
                System.out.print("*\t");
            }
            str -= 2; // incrementing stars,most imp step
            System.out.println();
        }
    }

}
