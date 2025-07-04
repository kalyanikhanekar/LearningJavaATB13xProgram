package july4th_SuperThis;

public class Lab_AccessPrivateModifier {
    public static void main(String[] args) {
        UPIPayment upi=new UPIPayment();
        upi.paymentdone();
    }
}
class BankAccount{
    private float balance;
    private String type;

    public float getBalance() {
        return balance;
    }

    public void setBalance(float balance) {
        this.balance = balance;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
class UPIPayment extends BankAccount{

    UPIPayment(){
        super.setBalance(65432);
        super.setType("Saving");
    }
    void paymentdone(){
        System.out.println(super.getBalance());
        System.out.println(super.getType());


    }

}
class CardPayment {



}