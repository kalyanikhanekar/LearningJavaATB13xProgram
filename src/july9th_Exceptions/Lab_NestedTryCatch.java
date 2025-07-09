package july9th_Exceptions;

public class Lab_NestedTryCatch {
    public static void main(String[] args) {
        int a=230;
        int b=0;
        int c[]={4,5,3,2};
        try{
              //  int d=a/b; if write here only Arithmetic exception execute inner will not
            try{
                int f=c[4];

            }catch (ArrayIndexOutOfBoundsException e){
                System.out.println(e.getMessage());
            }
            int d=a/b;//this will execute so both exceptions are executed

        }catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }
    }
}
