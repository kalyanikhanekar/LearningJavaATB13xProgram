package july31_Task;

import java.util.Scanner;

public class Lab_commonArrayelements {
    public static void main(String[] args) {
        int array1[]=new int[5];
        int array2[]=new int [6];
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the first array element");
        for(int i=0;i<array1.length;i++){
            array1[i]=sc.nextInt();
        }
        System.out.println("Enter the second array element");
        for(int i=0;i<array2.length;i++){
            array2[i]=sc.nextInt();
        }


        for(int i=0;i<array1.length;i++){

          for(int j=0;j<array2.length;j++){
              if(array1[i]==array2[j]){
                  System.out.println("Same element  "+array1[i]);
              }
          }
        }
    }
}
