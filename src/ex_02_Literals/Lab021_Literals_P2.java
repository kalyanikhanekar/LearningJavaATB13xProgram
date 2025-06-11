package ex_02_Literals;

public class Lab021_Literals_P2 {
    public static void main(String[] args) {
        float pi = 3.14f;
        float pi2 = 3.14F;
        float x = 10.00f;
        //this is the literal value not changed(pi)

        int Enum = 9; // enum is keyword but we can used Enum as Java
        // is case_sensitive so both are different
        System.out.println(Enum);


        char c1 = 'A'; // A to Z, a-z, !@#$%^&*()_+
        // Escape Char
        char new_line = '\n';
        char tab_line = '\t';
        char back_space = '\b';
        char carriage_return = '\r';

        System.out.println("Kalyani"+tab_line+"Khanekar");
    }
}
