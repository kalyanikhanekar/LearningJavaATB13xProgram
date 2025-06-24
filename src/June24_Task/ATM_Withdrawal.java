package June24_Task;

import java.util.Scanner;

public class ATM_Withdrawal {
    public static void main(String[] args) {

        long amount=10000;
        System.out.println("Enter the amount to be withdrwal");
        Scanner sc=new Scanner(System.in);
        long withrawal_amt=sc.nextLong();
        if(withrawal_amt<0){
            System.out.println("Invalid amount entered");
            return;

        }

        if(withrawal_amt%100==0 && withrawal_amt<=amount){
            amount=amount-withrawal_amt;
            System.out.println("Amount withdrawal Successfully!!!!!!!!!!");
            System.out.println("Balance....  "+amount);

        }
        else{
            System.out.println("Invalid amount entered ");
            return;
        }
    }
}
