package ex_01_Java_Basic;
/*
 *
 **
 ***
 ****
 *****

 */
public class Lab011_RightTriangleStarPattern {
    public static void main(String[] args) {

        int n=6;
        for(int i=0;i<=n;i++) {
            for (int j = 0; j <i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }


    }
}
