package ex_03_TypeCasting;

public class Lab024_TypeCasting01 {
    public static void main(String[] args) {
        byte a=10;
        int b=a;//assigning small to big ...it is Widening implicit and it is done by java itself
        //no need to we write
        // int b=(int)a;  Widening Explicit casting,explicitly we're telling java to do this
        System.out.println(a+b);//20
        System.out.println(" "+a+" "+b);//10 10




    }
}
