package ex_01_Java_Basic;

public class Lab_RemoveDuplicatesInArray {

    public static void main(String[] args) {
        {
            int array[]=new int[7];

            array[0]=3;
            array[1]=2;
            array[2]=3;
            array[3]=2;
            array[4]=4;
            array[5]=1;
            array[6]=5;
           // int array[]=new int[10];
            for(int i=0;i<array.length;i++){
                for(int j=i+1;j<array.length;j++){
                    if(array[i]==array[j]){
                        array[i]=0;
                    }
                }
            }
            for(int i=0;i<array.length;i++){
                System.out.println(array[i]);
            }



        }
    }
}
