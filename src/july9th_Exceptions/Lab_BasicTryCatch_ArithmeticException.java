package july9th_Exceptions;

public class Lab_BasicTryCatch_ArithmeticException {
    public static void main(String[] args) {
        Integer a=100;
        Integer b=0;

        try{
            int c=a/b;

        }
        catch(ArithmeticException e)
        {
           System.out.println(e.getMessage());


        }

    }


}
