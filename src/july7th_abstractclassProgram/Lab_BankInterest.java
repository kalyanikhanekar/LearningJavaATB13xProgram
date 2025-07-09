package july7th_abstractclassProgram;

public class Lab_BankInterest {
    public static void main(String[] args) {

        SBI sbi=new SBI();
        sbi.getInterest();
        HDFC hdfc=new HDFC();
        hdfc.getInterest();

    }
}
abstract class Bank{
    abstract void getInterest();

}
class SBI extends Bank{
    @Override
    void getInterest() {
        System.out.println("SBI Interest Rate: 6.5%");
    }
}
class HDFC extends Bank{
    @Override
    void getInterest() {
        System.out.println("HDFC Interest Rate: 7.0%");
    }
}