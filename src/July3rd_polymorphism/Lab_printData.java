package July3rd_polymorphism;

public class Lab_printData {

    public static void main(String[] args) {

        Printer print=new Printer();
        print.printData(13);
        print.printData(23);
        print.printData("Hello");
        print.printData(43.65);


    }
}
class Printer{
    void printData(String str){
        System.out.println("String Printer method "+str);
    }
  /*  void printData(int a){
        System.out.println("Integer Printer method "+a);
    }*/
    void printData(float a){
        System.out.println("Float Printer method "+a);
    }
    void printData(double d){
        System.out.println("Double Printer method "+d);
    }
}
/*
Integer Printer method 13
Double Printer method 23.4
String Printer method Hello
Double Printer method 43.65


conclusion we pass only 23.4 for float method it calls double data type method.
if pass 23.4f then call float data type method
if pass integer call float method
if we pass integer and not int method then int promoted to float like below promotion rule


Type Promotion Rules for Overloading
byte → short → int → long → float → double

 */