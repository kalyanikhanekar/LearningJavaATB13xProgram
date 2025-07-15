package ex_08_String;

import java.util.Arrays;

public class Lab_groupletters {
    public static void main(String[] args) {

        String str="I Love Dogs";

        String arr[] = new String[35];

        str=str.replace(" ","");

        for(int i=0;i<str.length();i++){
            for(int j=i+1;j<str.length();j++){
                if(str.charAt(i)!=str.charAt(j)){
                  char c=str.charAt(i);
                    char c1=str.charAt(j);
                    String result = "" + c + c1;

                    System.out.print(","+c+c1);


                }
            }
        }

    }
}
