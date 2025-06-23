package ex_08_String;

public class Lab_String06_IQ {
    public static void main(String[] args) {

        String s1="Hello";
        String s2="Hello";

        String s3=new String("Hello");
        String s4=new String("Hello");
        String s5=new String("hello");

        // this check the locations reference(address)
        System.out.println(s1==s3);
        System.out.println(s2==s4);
        System.out.println(s3==s4);

        System.out.println(s1==s2);
        System.out.println(s4==s5);

        System.out.println(s1.equals(s3));
        System.out.println(s1.equals(s4));
        System.out.println(s4.equals(s5));
        System.out.println(s4.equalsIgnoreCase(s5));


    }
}
/*
C:\Users\HP\.jdks\openjdk-24.0.1\bin\java.exe "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2025.1.2\lib\idea_rt.jar=65474" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath C:\Users\HP\IdeaProjects\LearningJavaATB13xProgram\out\production\LearningJavaATB13xProgram Ex_08_String.Lab_String06_IQ
false
false
false
true
false
true
true
false
true

Process finished with exit code 0
 */