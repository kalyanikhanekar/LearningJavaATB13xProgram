package ex_01_Java_Basic;

public class Lab012_LeftTriangleStarPattern {
    public static void main(String[] args) {
        int n=7;//number of lines

        for(int i=0;i<=n;i++){

            for(int j=n;j>i;j--){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}

