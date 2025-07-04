package july4th_SuperThis;

public class Lab_ParentVariablesUsingSuper {
    public static void main(String[] args) {

        Father father=new Father(15000,"maruti");

        Son son=new Son();
        son.shopping();


    }
}

class Father
{
    int salary;
    String car;
    Father(int salary,String car){
        this.salary=salary;
        this.car=car;
    }

    public Father() {

    }
}

class Son extends Father{



    void shopping(){
        System.out.println("Using Father money for shopping"+super.salary);
        System.out.println("Using father car for travelling "+super.car);
    }
}