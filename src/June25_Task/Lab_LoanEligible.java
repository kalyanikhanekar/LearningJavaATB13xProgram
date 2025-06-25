package June25_Task;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class Lab_LoanEligible {
    int age;
    float sal;
    int credit_score;
    public static void main(String[] args) {

        Lab_LoanEligible person=new Lab_LoanEligible();
        person.get_data();
       boolean age_validation=person.age_validation();

        if(!age_validation){
            System.out.println("Invalid age entered  Not fitted in criteria....");
            return;
        }
        boolean sal_val=person.salary_validation();
        if(!sal_val){
            System.out.println("Invalid salary entered  Not fitted in criteria....");
            return;
        }

        boolean credit=person.credit_verification();
        if(!credit){
            System.out.println("Invalid credit score entered  Not fitted in criteria....");
            return;
        }

        if(credit&&sal_val&&age_validation){
            System.out.println("Congratulations!!!!!!!!!!!!!!!!!!!!");
            System.out.println("Your are Eligible for loan.........");
        }


    }
    public void get_data(){
        Lab_LoanEligible person=new Lab_LoanEligible();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the age  ");
        age=sc.nextInt();
        System.out.println("Enter the Salary amount ");
        sal=sc.nextFloat();
        System.out.println("enter the credit score");
        credit_score=sc.nextInt();

    }
    public boolean age_validation(){

        if(age>0 && age >=18 && age <=80){
            return true;
        }
       else {
            return false;
        }
    }

    public boolean salary_validation(){
        if(sal!=0 && sal>=30000){
            return true;
        }
        else return false;
    }

    public boolean credit_verification(){

        if(credit_score!=0&&credit_score>650&&credit_score<850){
            return true;
        }
        else return false;
    }


}
