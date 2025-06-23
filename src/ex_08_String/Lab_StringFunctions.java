package ex_08_String;

public class Lab_StringFunctions {

    public static void main(String[] args) {

        String str="Kalyani";

        //length of the string
        System.out.println("String length"+str.length());

        //give specific character of the string
        System.out.println("CharAt() function Character at 3rd index"+str.charAt(3));
        System.out.println("CharAt() function Character at 5th index"+str.charAt(5));

        //concat   append at the end
        System.out.println("concat() "+str.concat(" Khanekar"));

        //contains
        System.out.println("contains() "+str.concat("an"));

        //equals
        System.out.println("equals() "+str.equals("Kalyani"));

        //equalsIgnoreCase
        System.out.println("equalsIgnoreCase() "+str.equalsIgnoreCase("KALYANI"));

        //indexof()
        System.out.println("indexOf() "+str.indexOf('y'));

        //replace()
        String replaced=str.replace("k","*");
        System.out.println("replace() "+replaced);



        //split()
        String name4 = "kalyani@FC.com@123";
        String [] split_name= name4.split("@");
        System.out.println("Split  "+split_name);

        // 10. substring( , )  , sonal
        System.out.println(str.substring(1, 3));

        // 11. toLowerCase()
        System.out.println("KALYANI".toLowerCase());

        // 12. toUpperCase()
        System.out.println("kalyani".toUpperCase());

        // 14. startsWith()
        System.out.println(str.startsWith("S"));

        // 15. endsWith()
        System.out.println(str.endsWith("a"));



    }
}
