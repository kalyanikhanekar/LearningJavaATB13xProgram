package ex_12_Inheritance;

class User{
    void login(){

        System.out.println("User Login() calling.....");
    }
}
class AdminUser extends User{
    void accessAdminPanel(){
        System.out.println("AdminUser accessAdminPanel() calling....");
    }
}
class SuperAdmin extends AdminUser{
    void shutDownSystem(){
        System.out.println("SuperAdmin shutDownSystem() calling........");
    }
}
public class Lab_Program03 {
    public static void main(String[] args) {
        SuperAdmin sp=new SuperAdmin();

        sp.login();
        sp.accessAdminPanel();
        sp.shutDownSystem();

    }
}

