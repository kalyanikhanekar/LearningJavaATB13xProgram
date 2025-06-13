package ex_01_Java_Basic;

interface Parent {
  void display2();

  public default void display(){
      System.out.println("The Interface method with body ");

  }

}
public class interface01 implements Parent {
   @Override
   public void display2(){

       System.out.println("Method calling from chidl class");


   }

   public void display(){

       System.out.println("Default from interface overloaded in child class");
   }
    public static void main(String[] args) {
        interface01 object=new interface01();
        object.display2();
        object.display();


    }

}
