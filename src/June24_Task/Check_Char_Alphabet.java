package June24_Task;

import java.util.Scanner;

public class Check_Char_Alphabet {
    public static void main(String[] args) {
        char c;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the single character");
         c=sc.next().charAt(0);
        System.out.println("Entered character "+c);
        if(c>=65&&c<=90 || c>=97&&c<=122){
            System.out.println("Enter character is alphabet " +c);

        }
        else
        {
            System.out.println(c+"  is not alphabet ");
        }


    }
}
