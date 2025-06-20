package ex_07_Functions;

public class Lab_Function04 {
    public static void main(String[] args) {
        int add=addition_return(10,20);
        System.out.println("Addition "+add);
        addition1_notReturn(45,67);

    }



    static int addition_return(int a,int b){
        return a+b;
    }

    static void addition1_notReturn(int a, int b){
        System.out.println(a+b);
    }
}
