package ex_03_TypeCasting;

public class Lab026_TypeCasting03 {
    public static void main(String[] args) {
        long phone = 9876543210l;
      // short s = phone; // Implicit Narrow? not possible, showing error
        short s1 = (short)phone; // Explicit Narrow? possible
        System.out.println(s1);//data loss o/p 5866
    }
}
