package july4th_SuperThis;

public class Lab_ParentMethodsSuper {
    public static void main(String[] args) {

        PDFDocument pdf=new PDFDocument();
        pdf.read();
        pdf.save();
        ExcelDocument excel=new ExcelDocument();


    }
}
class Document{

    void read(){
        System.out.println("Reading document is common for all types of document " +
                "so implement that method in parent class Document");
    }

    void save(){
        System.out.println("Save the changes");
    }



}
class PDFDocument extends Document{
    void read(){
        super.read();
    }
    void save(){
        super.save();
    }
}
class ExcelDocument extends Document{

    ExcelDocument(){
        //in constructor itself calling read method
        super.read();
        super.save();
    }
}