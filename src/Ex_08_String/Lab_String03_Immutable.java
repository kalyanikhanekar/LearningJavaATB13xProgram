package Ex_08_String;

public class Lab_String03_Immutable {
    public static void main(String[] args) {
        String s1 = "hello";
        s1 = s1.concat("world"); // Concat, basically add the value or merge the value in the end.
        System.out.println(s1);
    }
}
