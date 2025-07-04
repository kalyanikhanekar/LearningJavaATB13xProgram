package ex_08_String;

public class Lab_removeSpaces {
    public static void main(String[] args) {
        StringBuilder str= new StringBuilder("aaa bbbb cccc tttt");


        String newstr="";
        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);

            if(c!=' '){

                newstr+=c;
            }
        }
        System.out.println(str);
        System.out.println(newstr);
    }
}
