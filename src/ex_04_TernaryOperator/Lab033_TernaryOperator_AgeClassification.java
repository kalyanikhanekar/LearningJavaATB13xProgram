package ex_04_TernaryOperator;

public class Lab033_TernaryOperator_AgeClassification {
    public static void main(String[] args) {
        byte age=70;

       // String s = (age < 65) ? "Adult" : "senior";
        String result=(age>18)?(age < 65) ? "Adult" : "senior":"Minor";
        if(result=="Adult"||result=="senior") {
            System.out.println("Eligibale For Vote "+result);
        }
    }
}
