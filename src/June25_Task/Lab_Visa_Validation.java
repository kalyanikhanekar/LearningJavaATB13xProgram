package June25_Task;

import java.util.Scanner;

public class Lab_Visa_Validation {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("enter the age.......    ");
        int age=sc.nextInt();
        if(age<0){
            System.out.println("Invalid data entered.. Can not tavel.........");
            return;
        }
        System.out.println("Enter the Visa Status........  ");
        String status=sc.next();

         if(status.equalsIgnoreCase("invalid")){
            System.out.println("Your visa status in Invalid...You can not travel...");
            return;
        }
        if(age>18 && status.equalsIgnoreCase("valid")){
            System.out.println("You Can Travel Visa is valid ...........");
        }


    }
}
