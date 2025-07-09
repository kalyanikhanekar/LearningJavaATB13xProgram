package july9th_Exceptions;

public class Lab_CatchSpecificGenericException {
    public static void main(String[] args) {

        String s=null;

        try{
            s.trim();
        }
//        catch(Exception e){
//            System.out.println(e.getMessage());
//        }//Cannot invoke "String.trim()" because "s" is null

catch(NullPointerException e){
    System.out.println(e.getMessage());
}



    }
}
