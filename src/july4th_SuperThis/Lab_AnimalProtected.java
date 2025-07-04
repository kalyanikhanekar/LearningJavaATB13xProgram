package july4th_SuperThis;

public class Lab_AnimalProtected {
    public static void main(String[] args) {
        dog d=new dog();
        d.doeat();

    }
}

class animal{
    protected void eat(){
        System.out.println("Animal is eating");

    }
}
class dog extends animal{
 void   doeat(){
        super.eat();
    }
}
