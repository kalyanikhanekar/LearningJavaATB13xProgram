package ex_01_Java_Basic;

public class Lab_NoofDigitInNumber {
    public static void main(String[] args) {
        int n=234543;
        int digit=0;
        while(n>0){
         n=n/10;
         digit++;

        }
        System.out.println("Digits  "+digit);
    }
}
