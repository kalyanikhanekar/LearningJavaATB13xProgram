package ex_01_Java_Basic;

import java.util.Scanner;

public class Lab015_ReverseString {
    public static void main(String[] args) {
        String str;
        System.out.println("Enter the String");
        Scanner sc=new Scanner(System.in);
        str=sc.nextLine();
        String reverse="";

        for(int i=str.length()-1;i>=0;i--){

            char c=str.charAt(i);
            reverse=reverse+c;

        }
        System.out.println("Original String  "+str+"  Reverse String "+reverse);

        if(str.equalsIgnoreCase(reverse)){
            System.out.println("Palindrome String  "+str);
        }
        else{
            System.out.println("Not Palindrome "+str);
        }
    }


}
