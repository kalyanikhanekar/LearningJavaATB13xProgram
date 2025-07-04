package july4th_SuperThis;

public class Lab_studentDefault {
    public static void main(String[] args) {
                Student student = new Student();
                student.showDetails();
                TestDefault test=new TestDefault();
                test.showDetails();
    }
}
class Student{
    void showDetails(){
        System.out.println("Studenr deatils");
    }
}
