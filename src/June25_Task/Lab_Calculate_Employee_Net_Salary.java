package June25_Task;

import java.util.Scanner;

public class Lab_Calculate_Employee_Net_Salary {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the Basic Pay Amount of a month");
        float basic_pay=sc.nextFloat();
        //Earning per month
        float hra=(basic_pay/100)*40;//40 %
        System.out.println("HRA monthly  "+hra);
        float DA=(basic_pay/100)*3;//3 %
        System.out.println("DA  monthly  "+DA);
        float gross_sal=basic_pay+hra+DA;
        System.out.println("Gross Salary Monthly  "+gross_sal);
        float pf=(basic_pay/100)*12;
        System.out.println("Monthly Pf Deduction amount is  "+pf);
        float tax_monthly=200;
        System.out.println("Monthly Tax Deducation "+tax_monthly);
        float tax;
        float package_yearly=gross_sal*12;
        System.out.println("Yearly Package Amount  "+package_yearly);
        if(package_yearly<400000){
            tax=0;
            System.out.println("you are under  Rs. 0 to Rs. 4 lakh  slot No Tax Applicable");
        }else if(package_yearly>400000 && package_yearly<800000)
        {
            tax=(package_yearly/100)*5;
            System.out.println("You are under Rs. 4 lakh to Rs. 8 lakh – 5% Tax  and Amount is  "+tax);
        }else if(package_yearly>800000 && package_yearly<1200000)
        {
            tax=(package_yearly/100)*10;
            System.out.println("You are under Rs. 8 lakh to Rs. 12 lakh – 10% Tax  and Amount is  "+tax);
        }else if(package_yearly>1200000 && package_yearly<1600000)
        {
            tax=(package_yearly/100)*15;
            System.out.println("You are under Rs. 12 lakh to Rs. 16 lakh – 15%, Tax  and Amount is  "+tax);
        }else if(package_yearly>1600000 && package_yearly<2000000)
        {
            tax=(package_yearly/100)*20;
            System.out.println("You are under Rs. 16 lakh to Rs. 20 lakh – 20%, Tax  and Amount is  "+tax);
        }else if(package_yearly>2000000 && package_yearly<2400000)
        {
            tax=(package_yearly/100)*25;
            System.out.println("You are under Rs. 20 lakh to Rs. 24 lakh – 25%, Tax  and Amount is  "+tax);
        }else if(package_yearly>2400000)
        {
            tax=(package_yearly/100)*30;
            System.out.println("You are gtrater than Rs. 24 lakh – 30%, Tax  and Amount is  "+tax);
        }
        else {
            System.out.println("Invalid Data ......");
        }


    }
}
