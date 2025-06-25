package June25_Task;

import java.util.Scanner;

public class Lab_Armstrong_Number {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number  ......");
        int num=sc.nextInt();
        int original=num;
        int cube=1;
        int sum=0;
        while(num!=0){

            int rem=num%10;
            cube=rem*rem*rem;
            sum=sum+cube;
            num=num/10;

        }
        if(original==sum){
            System.out.println("Amstrong Number  "+original);
        }else{
            System.out.println("Not Amstrong Number  "+original);
        }

    }
}
