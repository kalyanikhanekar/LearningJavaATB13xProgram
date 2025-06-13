package CollectionsDemo;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListAddAll {
    public static void main(String[] args) {
        ArrayList arrayList=new ArrayList();

        ArrayList arrayList1=new ArrayList();

        arrayList.add("Kalyani");
        arrayList.add("Khanekar");
        arrayList.add(100);
        arrayList.add("C");
        arrayList.add(56.7);
        arrayList.add(true);

        arrayList1.add("New List");
        arrayList1.add(" added");
        arrayList1.add(600);
        arrayList1.add('A');

        System.out.println("First List"+arrayList);
        System.out.println("Sewcond  List"+arrayList1);

        arrayList.addAll(arrayList1);
        System.out.println("First List again"+arrayList);

        //Remove all
            arrayList.removeAll(arrayList1);
        System.out.println("after removing list 2"+arrayList);

        arrayList.clear();
        System.out.println(arrayList);
        arrayList.add(46);
        arrayList.add(898);
        arrayList.add(140);
        arrayList.add(45);
        //Sort
        Collections.sort(arrayList);
        System.out.println("After Sorting "+arrayList);

        //Reverse order
        Collections.sort(arrayList,Collections.reverseOrder());
        System.out.println(arrayList);


    }
}
