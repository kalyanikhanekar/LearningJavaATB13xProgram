package july7th_abstractclassProgram;

public class Lab_interfaceInJava {
    public static void main(String[] args) {
        Document doc=new Document();
        doc.print();
        doc.show();

    }
}
interface Printable{
    default void   print(){
         System.out.println("Printing documnet from interface...");
     };
}
interface Showable{
default void show(){
    System.out.println("Show documnet from interface...");
}
default void print(){
    System.out.println("Showable print method calling...");

}
}

class Document implements Printable,Showable{


    @Override
    public void print() {
        Printable.super.print();
        Showable.super.print();
    }
}