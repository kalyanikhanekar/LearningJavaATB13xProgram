package ex_08_String;

public class Lab_String01_Immutable{
    public static void main(String[] args) {

        String s="Kalyani";

        s.toUpperCase();// o/p will be Kalyani only
        System.out.println(s);

        s=s.toUpperCase();// string get upper case but in string
        // constant pool another refernce create not change happened in s
        // two string is created

        System.out.println(s);

    }


}
