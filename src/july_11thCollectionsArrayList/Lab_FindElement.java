package july_11thCollectionsArrayList;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lab_FindElement {
    public static void main(String[] args) {

        List cities=new ArrayList();

        cities.add("Mumbai");
        cities.add("Pune");
        cities.add("Delhi");
        System.out.println("Enter the city name ");
        Scanner sc=new Scanner(System.in);

        String city=sc.next();
        int flag=0;
        for(Object obj:cities){
            if(obj.equals(city)){
                System.out.println(obj+" is in the list ");
                flag=1;
                break;
            }
        }
        if (flag==0){
            System.out.println(city+" not in the list");
        }

    }
}
