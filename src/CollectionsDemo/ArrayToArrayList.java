package CollectionsDemo;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayToArrayList {
    public static void main(String[] args) {

        String str[]={"abc","xyz","Kalyani"};

        for(String s:str){
            System.out.println(s);
        }

        ArrayList arrayList=new ArrayList(Arrays.asList(str));

        System.out.println(arrayList);
    }
}
