package ex_09_StringBuilder_StringBuffer;

public class Lab_RemoveAllSpecialCharacter {
    public static void main(String[] args) {

        String str="Hello@#123! Kalyani$%";
        StringBuilder strnew=new StringBuilder();

        for(char c:str.toCharArray()){
            if(Character.isLetterOrDigit(c)||Character.isWhitespace(c)){
                strnew.append(c);


            }

        }
        System.out.println(strnew);
    }
}
