package July3rd_polymorphism.July3rd_methodOverriding;

import java.util.Scanner;

public class Lab_userLogin {
    public static void main(String[] args) {
        final String userName="Admin123";
        final String passWord="pass4567";


        String username;
        String password;

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Username and Password");
        username=sc.next();
        password=sc.next();

        if(userName.equals(username)&&passWord.equals(password)){
            User user=new AdminUser();
            user.login();
        }
        else {
            User user=new RegularUser();
            user.login();
        }


    }
}
class User{
    void login(){

    }
}
class AdminUser extends User {
    void login(){
        System.out.println("Admin User Login.....");
    }
}
class RegularUser extends User{
    void login(){
        System.out.println("Regular User Login....");

    }
}