package ex_10_Array;

import java.util.Arrays;
import java.util.Scanner;

public class MergerUnsortedArraysToSortedArray {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of first array");

        int arr[]=new int[sc.nextInt()];
        System.out.println("Enter first array elements");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the size of second array");
        int b[]=new int[sc.nextInt()];
        System.out.println("Enter second array elements");
        for(int i=0;i<b.length;i++){
            b[i]=sc.nextInt();
        }

        int c[]=new int[arr.length+b.length];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-1-i;j++){
                if (arr[j] > arr[j + 1]) {
                    // Swap elements
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        for(int i=0;i<b.length;i++){
            for(int j=0;j<b.length-1-i;j++){
                if (b[j] > b[j + 1]) {
                    // Swap elements
                    int temp = b[j];
                    b[j] = b[j + 1];
                    b[j + 1] = temp;
                }
            }
        }


        int max_len=0;
        int min_len=0;
        if(arr.length>b.length){
            max_len=arr.length;
            min_len=b.length;
        }else{
            max_len=b.length;
            min_len=arr.length;
        }

        int j=0;
        int i=0;
        int k=0;
        while(min_len>0) {

            if (arr[i] < b[k]) {
                c[j]=arr[i];
                i++;
                j++;
            }else{
                c[j]=b[k];
                k++;
                j++;
            }
            min_len--;
        }


        if(arr.length>b.length){
            max_len=arr.length;
            min_len=b.length;
        }else{
            max_len=b.length;
            min_len=arr.length;
        }

        if(min_len== arr.length){
            while(k<b.length){
                c[j]=b[k];
                k++;
                j++;
            }


        }else if(min_len==b.length){
            while(i<arr.length){
               c[j]= arr[i];
               i++;
               j++;
            }
        }


        System.out.println(Arrays.toString(c));




    }
}
