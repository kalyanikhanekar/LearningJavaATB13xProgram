package july9th_Exceptions;

public class Lab_thow {

    public static void main(String[] args) {

        int a=345;
        int b=0;
        try{
            if(b==0) {
                throw new ArithmeticException("divide by zero ");
            }
            int c=a/b;

        }catch(ArithmeticException e){
            System.out.println(e.getMessage());
        }
    }


}