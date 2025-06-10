package ex_01_Java_Basic;

public class Lab019_UsePrintf_ForTablePrinting {
    public static void main(String[] args) {


        int a = 9;
        int b = 1;

        System.out.println("Table of  9 is  ");
        System.out.printf("%d * % d = %d \n",a,b,a*b++);
        System.out.printf("%d * % d = %d \n",a,b,a*b++);
        System.out.printf("%d * % d = %d \n",a,b,a*b++);
        System.out.printf("%d * % d = %d \n",a,b,a*b++);
        System.out.printf("%d * % d = %d \n",a,b,a*b++);
        System.out.printf("%d * % d = %d \n",a,b,a*b++);
        System.out.printf("%d * % d = %d \n",a,b,a*b++);
        System.out.printf("%d * % d = %d \n",a,b,a*b++);
        System.out.printf("%d * % d = %d \n",a,b,a*b++);
        System.out.printf("%d * % d = %d \n",a,b,a*b++);

    }
}
/* OutPut
C:\Users\HP\.jdks\openjdk-24.0.1\bin\java.exe "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2025.1.2\lib\idea_rt.jar=49605" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath C:\Users\HP\IdeaProjects\LearningJavaATB13xProgram\out\production\LearningJavaATB13xProgram ex_01_Java_Basic.Lab019_UsePrintf_ForTablePrinting
Table of  9 is
9 *  1 = 9
9 *  2 = 18
9 *  3 = 27
9 *  4 = 36
9 *  5 = 45
9 *  6 = 54
9 *  7 = 63
9 *  8 = 72
9 *  9 = 81
9 *  10 = 90

Process finished with exit code 0

 */