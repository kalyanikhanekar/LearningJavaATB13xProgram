package july9th_Exceptions;

public class Lab_CatchUsingException {
    public static void main(String[] args) {
        int a=233;
        int b=0;
        String s=null;

        try{
          // int c=a/b;
            s.trim();//Cannot invoke "String.trim()" because "s" is null
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
