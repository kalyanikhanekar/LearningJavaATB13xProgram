package July3rd_polymorphism.July3rd_methodOverriding;

public class Lab_employeeRole {
    public static void main(String[] args) {

        Employee emp=new Employee();
        emp.role();

        Manager manager=new Manager();
        manager.role();

        Teacher teacher=new Teacher();
        teacher.role();

        Clerk clerk=new Clerk();
        clerk.role();

    }
}

class Employee{

    void role(){
        System.out.println("General Employee....");
    }
}
class Manager extends Employee{
    void role(){
        System.out.println("Employee Role = Manager ");
    }
}
class Teacher extends Employee{
    void role(){
        System.out.println("Employee Role = Teacher ");
    }
}
class Clerk extends Employee{
    void role(){
        System.out.println("Employee Role = Clerk ");
    }
}