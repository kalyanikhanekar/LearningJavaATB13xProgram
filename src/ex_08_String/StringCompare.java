package ex_08_String;

public class StringCompare {
    public static void main(String[] args) {
        String str1 = "Hello wyrld";
        String str2 = "Hello world";

        if (str1.length() != str2.length()) {
            System.out.println("Lenght not equal will not proceed further");
            return;
        }
        int flag = 0;
        for (int i = 0; i < str1.length(); i++) {
            if (!(str1.charAt(i) == str2.charAt(i))) {
                flag = 1;
            }
        }

        if (flag == 1) {
            System.out.println("String are not equal    str1=" + str1 + "  str2=" + str2);
        }
        else{
            System.out.println("String are equal   str1=" + str1 + "   str2=" + str2);
        }

    }
}
