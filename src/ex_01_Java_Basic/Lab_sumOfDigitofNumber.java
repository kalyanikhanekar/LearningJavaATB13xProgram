package ex_01_Java_Basic;

public class Lab_sumOfDigitofNumber {
    public static void main(String[] args) {
        int n=2345;
        int sum=0;
        while(n>0){
            int rem=n%10;
            sum=sum+rem;
            n=n/10;
        }
        System.out.println("Sum ="+sum);
    }
}
