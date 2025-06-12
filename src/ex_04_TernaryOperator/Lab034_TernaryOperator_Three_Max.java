package ex_04_TernaryOperator;

public class Lab034_TernaryOperator_Three_Max {
    public static void main(String[] args) {
        int a=19;
        int b=346;
        int c=78;

     int max=(a>b&&a>c)?a:(b>a&&b>c?b:c);

        System.out.println(max);


    }


}
