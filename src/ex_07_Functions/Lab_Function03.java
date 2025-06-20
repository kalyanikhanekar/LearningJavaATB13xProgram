package ex_07_Functions;

public class Lab_Function03 {
    public static void main(String[] args) {

        System.out.println(add());// int a=add(); are same
        int a=add();
        System.out.println(a);

        float f=sub();
        System.out.println(f);

        double d=mul();
        System.out.println(d);

    }


    static int add(){
       return 10;
    }
    static float sub(){
        return 12.4f;
    }

    static double mul(){
        return 23.4d;
    }
}
