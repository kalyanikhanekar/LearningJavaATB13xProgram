package Test_26June;

public class Program_2 {
    public static void main(String[] args) {

                String s1= "Hello";
                String s2= "hello";
                String s3= "Hello";

        System.out.println("equals   :"+s1==s2+"       " +(s2==s3));
        System.out.println("equalsIgnoreCase()    "+s1.equalsIgnoreCase(s2));
        System.out.println("compareTo()  "+s1.compareTo(s2));
    }
}
