package ex_02_Literals;

public class Lab022_InstanceOf_Operator {

    public static void main(String[] args) {
        String s1 = new String("Kalyani");
        System.out.println(s1 instanceof String);
        System.out.println(s1 instanceof Object);
//       System.out.println(s1 instanceof Integer);  giving error
    }
}
