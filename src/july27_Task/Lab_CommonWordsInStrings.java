package july27_Task;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lab_CommonWordsInStrings {
    public static void main(String[] args) {

        String str1 = "the kalyani is doing testing";
        String str2 = "kalyani is testing application";
        //out put : kalyani , is, testing

        String array1[] = str1.split(" ");
        String array2[] = str2.split(" ");

        List<String> l1=new ArrayList(Arrays.asList(array1));
        List<String> l2=new ArrayList(Arrays.asList(array2));

        for(String st:l1){

            if (l2.contains(st)) {
                System.out.println("    "+st);
            }
        }




    }
}
