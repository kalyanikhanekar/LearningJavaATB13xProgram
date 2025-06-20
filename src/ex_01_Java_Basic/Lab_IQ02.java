package ex_01_Java_Basic;

import java.lang.reflect.Array;
/*
Write the program for Input [1,2,3,4] Output [24,12,8,6]

 */
public class Lab_IQ02 {
    public static void main(String[] args) {

        int[] a ={1,2,3,4};
        int[] b = new int[a.length];
        int sum=1;
        int j=0;
        for(int i=0;i<a.length;i++){
            sum=1;

                for ( j = i-1; j > 0; j--) {
                    sum = sum * a[j];
                }
                for (int k = i+1; k < a.length; k++) {

                    sum = sum * a[k];
                }

            b[i]=sum;
        }

        for(int i=0;i<a.length;i++) {
            System.out.println(b[i]);
        }
        }

    }

