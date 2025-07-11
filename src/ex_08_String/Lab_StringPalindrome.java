package ex_08_String;

public class Lab_StringPalindrome {
    public static void main(String[] args) {
        String s1="hello";
        String rev="";

        for(int i=s1.length()-1;i>=0;i--){

            rev=rev+s1.charAt(i);

        }
        System.out.println(rev+"\t"+s1);
        if(rev.equals(s1)){
            System.out.println("palindrome");
        }
        else {
            System.out.println("Not Palindrome");
        }






    }
}
