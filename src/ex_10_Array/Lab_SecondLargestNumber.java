package ex_10_Array;

import java.util.Arrays;
import java.util.Scanner;

public class Lab_SecondLargestNumber {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Array size");
        int size=sc.nextInt();
        int arr[]=new int[size];
        System.out.print("Enter array Elements ");
        for(int i=0;i<size;i++){
            arr[i]=sc.nextInt();
        }
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    // Swap elements
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }




        for(int k=0;k<arr.length;k++){
            System.out.print("\t"+arr[k]);
        }
        System.out.println("\nSecond Largest number is  "+arr[size-2]);
    }
}
