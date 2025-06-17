package ex_06_Increment_Decrement;

public class cmd {
    public static void main(String[] args) {

        String str=args[0];

        int a=Integer.parseInt(str);

        String result=(a>=18)?"Yes":"NO";
        System.out.println(result);
    }
}
