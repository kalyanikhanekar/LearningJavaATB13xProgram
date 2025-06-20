package ex_07_Functions;

public class Lab_Function05 {
    public static void main(String[] args) {

        NoParameter_NoReturnType();
       String s= NoParameter_ReturnValue();
        System.out.println(s);
        Parameter_NoReturnValue(15,67);

    }

    //Without Parameter without return type
    static void NoParameter_NoReturnType(){
        System.out.println("NoParameter_NoReturnType");
    }
    //Without Parameter but with return type
    static String NoParameter_ReturnValue(){
        System.out.println("NoParameter_ReturnValue");
        return "Hello Kalyani";
    }
    //With Parameter but No return
    static void Parameter_NoReturnValue(int a,int b){
        System.out.println("Addition "+a+b);

    }



}
