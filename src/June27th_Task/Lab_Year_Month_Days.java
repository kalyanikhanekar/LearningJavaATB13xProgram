package June27th_Task;

import java.util.Scanner;

public class Lab_Year_Month_Days {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the days ");
        int days=sc.nextInt();
        //857
        int year=days/365;//2
        int months=(days-(year*365))/30;//days-730
        int d=days-((year*365)+(months*30));//

        System.out.println("Years:"+year+"  Months:"+months+"  Days: "+d);

    }
}
