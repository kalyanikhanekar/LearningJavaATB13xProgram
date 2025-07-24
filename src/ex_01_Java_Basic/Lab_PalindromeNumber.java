package ex_01_Java_Basic;

public class Lab_PalindromeNumber {
    public static void main(String[] args) {
        int n=12321 ;
        int n1=n;
        int pal=0;
        while(n>0){
            int rem=n%10;
            pal=pal*10+rem;
            n=n/10;
        }
        System.out.println(pal);
        if(n1==pal){
            System.out.println("Palindrome Number");

        }else{
            System.out.println("Not Palindrome");
        }
    }
}
