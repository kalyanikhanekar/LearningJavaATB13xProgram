package ex_01_Java_Basic;

import java.util.Scanner;

public class Lab036_CMDInput {
    public static void main(String[] args) {

        int length= args.length;

        for(int i=0;i<length;i++){
            System.out.println(args[i]);

        }

        Scanner sc=new Scanner(System.in);


    }
}
