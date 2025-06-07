package ex_01_Java_Basic;

import java.util.Scanner;

public class Lab010_LeapYear {
    public static void main(String[] args) {
        int year;
        //Take input from user
        Scanner sc=new Scanner(System.in);
        boolean flag=false;
        year=sc.nextInt();

        //leap year condition in if statament (year%4==0 && year%100!=0)||year%400==0

        if((year%4==0&&year%100!=0)||(year%400==0)){
            flag=true;

        }

        if(flag)
            System.out.println("Leap Year " +year) ;
        else
            System.out.println("Not Leap Year " +year) ;

    }
}
/* Output
C:\Users\HP\.jdks\openjdk-24.0.1\bin\java.exe "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2025.1.2\lib\idea_rt.jar=50887" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath C:\Users\HP\IdeaProjects\LearningJavaATB13xProgram\out\production\LearningJavaATB13xProgram ex_01_Java_Basic.Lab010_LeapYear
2004
Leap Year 2004

Process finished with exit code 0

C:\Users\HP\.jdks\openjdk-24.0.1\bin\java.exe "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2025.1.2\lib\idea_rt.jar=50908" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath C:\Users\HP\IdeaProjects\LearningJavaATB13xProgram\out\production\LearningJavaATB13xProgram ex_01_Java_Basic.Lab010_LeapYear
2025
Not Leap Year 2025

Process finished with exit code 0



 */