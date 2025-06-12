package ex_03_TypeCasting;

public class Lab025_TypeCasting02 {
    public static void main(String[] args) {
        int val=500;
        byte a;
        a= (byte) val;//From Big to small, Narrowing and explicit casting
        //Loss of data
        //int 32 bits 00000000000000000000000111110100
        //byte 8 bits 11110100 only take this much and others are losing

        System.out.println(a);

    }
}
