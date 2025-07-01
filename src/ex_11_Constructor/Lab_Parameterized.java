package ex_11_Constructor;

public class Lab_Parameterized {
    public static void main(String[] args) {

        Customer customer1 =new Customer();
        System.out.println("First Customer created by default constructor");
        customer1.display();

        Customer customer2=new Customer(345,"Meena",40,"services");
        System.out.println("Second Customer Created by Parameterized constructor");
        customer2.display();
    }
}

class Customer{
    int id;
    String Name;
    int age;
    String Department;

    Customer(){
       id=100;
       Name="Sheetal";
      age =45;
      Department="Modeling";

    }
    Customer(int newid,String newName,int newage,String newdepartment){
        id=newid;
        Name=newName;
        age=newage;
        Department=newdepartment;


    }

    void display(){
        System.out.println(id+"\t"+Name+"\t"+age+"\t"+Department);
    }
}
