package ex_11_Constructor;

public class Lab_default_constructor {

    public static void main(String[] args) {

        BaseClass obj=new BaseClass();//here default constructor called

    }
}
class BaseClass{

    BaseClass(){
        System.out.println("Base class default constructor");
    }
}