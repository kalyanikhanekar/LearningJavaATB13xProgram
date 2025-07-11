package ex_10_Array;

import java.util.Arrays;

public class Lab_ReverseArrayInPlace {
    public static void main(String[] args) {
        int a[]={4,6,2,9,6,3,7,2,7};

        int mid=a.length/2;
        int temp=0;
        int j=a.length-1;
        for(int i=0;i<=mid;i++){
            temp=a[j];
            a[j]=a[i];
            a[i]=temp;
            j--;
    }

        System.out.println(Arrays.toString(a));


    }


}
