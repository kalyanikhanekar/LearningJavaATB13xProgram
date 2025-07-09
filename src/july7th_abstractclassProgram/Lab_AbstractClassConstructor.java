package july7th_abstractclassProgram;

public class Lab_AbstractClassConstructor {
    public static void main(String[] args) {
        TraditonalClothes tl=new TraditonalClothes();
        tl.made();
        tl.made1();

    }
}
abstract class Clothes{
    Clothes(){
        System.out.println("Abstract class constructor... ");
    }
    void made1(){
        System.out.println("Abstract class Concrete method");
    }
}
class TraditonalClothes extends Clothes{
    void made(){
        System.out.println("Child class method");
    }
}