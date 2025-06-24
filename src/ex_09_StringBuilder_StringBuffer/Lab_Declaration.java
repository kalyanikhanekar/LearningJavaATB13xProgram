package ex_09_StringBuilder_StringBuffer;

public class Lab_Declaration {
    public static void main(String[] args) {

        //Create object
        StringBuilder stringbuilder=new StringBuilder("Kalyani learning java");
        System.out.println(stringbuilder);
     //   stringbuilder="Kalyani learning java";  // This is not allowed
        //Can assign using append
        stringbuilder.append("Adding another string");
        System.out.println(stringbuilder);


        //StringBuffer

        StringBuffer strbuffer=new StringBuffer("String Buffer object created");

        System.out.println(strbuffer);
        strbuffer.append(" Data appended to string buffer");
        System.out.println(strbuffer);

    }
}
