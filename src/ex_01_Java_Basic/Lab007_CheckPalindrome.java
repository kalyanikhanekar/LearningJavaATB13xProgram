package ex_01_Java_Basic;

import java.util.Scanner;

/*Create a program that checks whether a given string is a palindrome.
A palindrome is a word or phrase that reads the same backward as forward
(ignoring spaces, punctuation, and capitalization). Use an if-else statement
to determine if the string is a palindrome.
 */
public class Lab007_CheckPalindrome {

    public static void main(String[] args) {
        String str;
        //Take input string from user
    Scanner sc=new Scanner(System.in);
    str=sc.nextLine();
    String reverse="";
  String string=  str.trim();

  for(int i=string.length()-1;i>=0;i--){

      char c=string.charAt(i);
      if((c>=65&&c<=90)||(c>=97&&c<=122)){
          reverse=reverse+c;
      }

  }
        if(string.equals(reverse)) {
            System.out.println(" String is palindrome " + reverse);
        }
        else{
            System.out.println("String is not palindrome "+reverse);
        }

    }
}
