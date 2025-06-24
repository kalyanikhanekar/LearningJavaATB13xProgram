package ex_01_Java_Basic;

import java.util.Scanner;

public class Lab013_CountVowelsAndConsonants {
    public static void main(String[] args) {

        //Define variables for store count of vowels and consonants



        int vowels=0;
        int consonants=0;

        String str;
        //Input from user
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string Do not enter space on special characters");
        str=sc.next();


        for(int i=0;i<str.length();i++){
            char c=str.toLowerCase().charAt(i);
            if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
                vowels++;
            }
            else {
                consonants++;
            }
        }
        System.out.println("Vowels  "+vowels+" COnsonants  "+consonants);

    }
}
/*
Output
C:\Users\HP\.jdks\openjdk-24.0.1\bin\java.exe "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2025.1.2\lib\idea_rt.jar=57178" -Dfile.encoding=UTF-8 -Dsun.stdout.encoding=UTF-8 -Dsun.stderr.encoding=UTF-8 -classpath C:\Users\HP\IdeaProjects\LearningJavaATB13xProgram\out\production\LearningJavaATB13xProgram ex_01_Java_Basic.Lab013_CountVowelsAndConsonants
Enter the string Do not enter space on special characters
kalyani
Vowels  3 COnsonants  4

Process finished with exit code 0
 */