package July3rd_polymorphism;

public class Lab_multiplication {
    public static void main(String[] args) {

        MathOperations maths=new MathOperations();
        maths.multiply(23,56);
        int multiplication=maths.multiply(23,54);
        int multi1=maths.multiply(45,65,23);
        System.out.println(multiplication);
        System.out.println(multi1);
    }
}
class MathOperations{



   int multiply(int a,int b){

        return a*b;

    }
    int multiply(int a,int b,int c){
        return a*b*c;
    }


}