package ex_08_String;

import java.util.Arrays;
import java.util.Scanner;

public class Lab_FirstLetterOfEachWord {

    public static void main(String[] args) {
        String str;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the string");
        str=sc.nextLine();
        String array[]=str.split("\\s");
        char snew[]=new char[array.length];
        int i=0;
        for(String s:array){
           char c=s.charAt(0);
          snew[i]=c;
          i++;
        }
        System.out.println("First Letter of each words are "+ Arrays.toString(snew));

    }
}
