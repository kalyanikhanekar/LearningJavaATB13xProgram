package June25_Task;

import java.util.Scanner;

public class Lab_Electricity_Bill_Calculation {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Electricity Units ....");
        int unit=sc.nextInt();

        if(unit<=100&&unit>0){
            System.out.println("Bill Amount =  "+unit*0.50);
        }else if(unit>100 && unit <=200){
            double amount=100*0.50+((unit-100)*0.75);
            System.out.println("Bill Amount =  "+amount);

        }
        //Next 100 units (201-300): 1.20Rs per unit
        else if(unit>200&&unit<=300){
            double amount=(100*0.50)+(100*0.75)+((unit-200)*1.20);
            System.out.println("Bill Amount =  "+amount);
        }
        else if(unit>300){
            double amount=(100*0.50)+(100*0.75)+(100*1.20)+((unit-300)*1.50);
            System.out.println("Bill Amount =  "+amount);
        }

        else{
            System.out.println("Invalid Unit entered   ...........");
            return;
        }


    }


}
