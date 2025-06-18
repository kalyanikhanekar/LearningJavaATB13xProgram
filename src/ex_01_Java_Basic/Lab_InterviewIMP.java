package ex_01_Java_Basic;

public class Lab_InterviewIMP {
    public static void main(String[] args) {


    /*
    🔸 Input: "I Love Java Programming"
    🔸 Expected Output: "I Love Java gnimmargorP"
    */
        String str = "I Love Java Programming";
        String [] str1=str.split(" ");

        String str2=str1[3];
        String str3="" ;
        for(int i=str2.length()-1;i>0;i--){
            str3=str3+str2.charAt(i);
        }
        str1[3]=str3;
        String result=String.join(" ",str1);
        System.out.println((result));


}
        }
