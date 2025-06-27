package June27th_Task;

import java.util.Scanner;

public class Lab_WebSiteDomain {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        String str=sc.nextLine();
        System.out.println(str);
        System.out.println(str.length());
        String []str1=str.split("\\.");
        int len=str1.length;
        System.out.println(len);

        switch(str1[len-1]){
            case "com":
                System.out.println("The website type is: Commercial website");
                break;
            case "org":
                System.out.println("The website type is: Non-profit organization");
                break;
            case "edu":
                System.out.println("The website type is: Educational institution");
                break;
            case "gov":
                System.out.println("The website type is: Government website");
                break;
            case "net":
                System.out.println("The website type is: Network-related website");
                break;
            case "info":
                System.out.println("The website type is: Informational website");
                break;
            default:
                System.out.println("The website type is: Unknown or other types of websites");
        }

    }
}
