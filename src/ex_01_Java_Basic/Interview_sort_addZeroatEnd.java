package ex_01_Java_Basic;

/*
[1,0,2,0,3,4,0,5,6,0,7], output = [1,2,3,4,5,6,7,0,0]
 */


public class Interview_sort_addZeroatEnd {
    public static void main(String[] args) {


        System.out.println("Numbers in Ascending Order");
        int[] arr = {9, 0, 10, 5, 0, 2, 4, 0, 1};
        int[] arr1 = new int[arr.length];
        int j=0;
        int zero=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
               arr1[j]=arr[i];
               j++;
            }
            else{
                zero++;
            }
        }
        for(int i=0;i<arr1.length-zero;i++){// here we not taking last array elements having value '0'
            //by using zero counter

            for(int k=0;k<arr1.length-1-zero;k++){

                if(arr1[i]<arr1[k]){
                    int temp=arr1[i];
                    arr1[i]=arr1[k];
                    arr1[k]=temp;
                }

            }


        }

        for(int i=0;i<arr1.length;i++){
            System.out.println(arr1[i]);
        }

        Interview_sort_addZeroatEnd t=new Interview_sort_addZeroatEnd();

        System.out.println("Numbers in  Descending  Order ");
       t.Decending_order();

    }
    public void Decending_order(){
        int[] arr = {9, 0, 10, 5, 0, 2, 4, 0, 1};
        int[] arr1 = new int[arr.length];
        int j=0;
        int zero=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                arr1[j]=arr[i];
                j++;
            }
            else{
                zero++;
            }
        }
        for(int i=0;i<arr1.length;i++){

            for(int k=0;k<arr1.length-1;k++){

                if(arr1[i]>arr1[k]){
                    int temp=arr1[i];
                    arr1[i]=arr1[k];
                    arr1[k]=temp;
                }

            }


        }

        for(int i=0;i<arr1.length;i++){
            System.out.println(arr1[i]);
        }
    }
}
