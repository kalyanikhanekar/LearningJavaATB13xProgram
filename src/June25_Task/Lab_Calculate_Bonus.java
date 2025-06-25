package June25_Task;

import java.util.Scanner;

public class Lab_Calculate_Bonus {
 /*   take the salary and Year info from the User.

    Implement Bonus Calculation Logic:

    Define the bonus structure based on salary and years of experience.

           :- If years of experience is less than 1 year: No bonus.

            :- If years of experience is between 1 and 3 years: Bonus is 5% of the salary.

           :- If years of experience is between 4 and 6 years: Bonus is 10% of the salary.

           :- If years of experience is greater than 6 years: Bonus is 15% of the salary.
*/

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Salary amount and year experience");
        float sal=sc.nextFloat();
        System.out.println("Enter the year of experience in years format");
        int exp=sc.nextInt();
        float bonus;
        if(sal<0){
            System.out.println("Invalid data entered   ");
            return;
        }
        if(exp<1 && exp>0){
            System.out.println("Not eligible for bonus because year of experience is less than 1 year");
        }else if(exp>1 && exp<3){
            bonus=(sal/100)*5;
            System.out.println("Bonus Amount is   "+bonus);
        }else if(exp>4 && exp<6){
            bonus=(sal/100)*10;
            System.out.println("Bonus Amount is   "+bonus);
        }else if(exp>6){
            bonus=(sal/100)*15;
            System.out.println("Bonus Amount is   "+bonus);
        }

    }
}

