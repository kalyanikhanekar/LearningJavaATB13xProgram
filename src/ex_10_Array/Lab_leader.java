package ex_10_Array;

import java.util.Scanner;

public class Lab_leader {
    public static void main(String[] args) {
        int a[]={6,4,99,3,57,43,1,21};
//        System.out.println("Enter array Elements  ");
//        Scanner sc=

        for(int i=0;i<a.length;i++){
            int max=a[i];
            for(int j=i+1;j<a.length;j++){
                if(max<a[j]){
                    max=a[j];
                }
            }
            if(max==a[i]){
                System.out.println("Leader element "+max);
            }
        }


    }
}
