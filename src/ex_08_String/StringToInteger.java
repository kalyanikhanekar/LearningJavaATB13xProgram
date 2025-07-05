package ex_08_String;

public class StringToInteger {
    public static void main(String[] args) {

        String str="the testig project";
       // str=str.replace(" ","");
        str=str.replaceAll("\\s","");
        String n="";
        System.out.println(str);
        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
            int num=c-0;
            n=n+num;
        }
        System.out.println(n);

        String n2=String.valueOf(n);
        System.out.println(n2);


    }


}
