package ex_08_String;

import java.util.Arrays;

public class LongestWord {

    public static void main(String[] args) {
        String str="the testing programm";

        String arr[]=str.split("\\s");

        System.out.println(Arrays.toString(arr));
        int maxlen=arr[0].length();
        int index=0;
        for(int i=0;i< arr.length;i++){

            if(maxlen<arr[i].length()){
                maxlen=arr[i].length();
                index=i;
            }
        }

        System.out.println("Max lenght  "+maxlen);
        System.out.println("Word is  "+arr[index]);
    }


}
