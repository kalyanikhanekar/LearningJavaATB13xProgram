package ex_02_Literals;

public class Lab023_Interview {
    public static void main(String[] args) {

        int a=10;
        boolean b=(10==11);//comparing 2 digits
        System.out.println(a);
        System.out.println(b);

        /* output
        10
        false
         */

        long l = 10l; // 8 Byte, 64 Bits  long need 64 bits
        String s = "name"; //  8 Byte, 64 Bits  String need 64 bits


        char a1 = 'A'; // ASCII - 65
        char b1 = 'B'; // 66
        System.out.println(a1+b1);

        /* output
        131

         */

        System.out.println('A' == 65);// output is true


        short sh = 10;
        char c = 'A';
        String s1 = "A";
        System.out.println(c+ sh);//gives addition
        System.out.println(c);//gives actual assigned value, if it is alog then
        // provide assigned value here is A
        System.out.println(c+c);//add the ascii values
        System.out.println(c+s1);//concatenate c and s1 value AA

        /*output
        75
A
130
AA
         */

    }
}
