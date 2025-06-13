package CollectionsDemo;

import java.util.*;

public class HashSetDemo {
    public static void main(String[] args) {

        //Declaration
        HashSet hm=new HashSet();
        //  Set hm1=new HashSet();

        //HashSet<Integer> hm2=new HashSet<>();

        hm.add("ABC");
        hm.add(123);
        hm.add(true);
        hm.add(null);
        hm.add(null);//will not add
        hm.add(45.6);
        hm.add(123);//will not add

        System.out.println(hm);
        //size()
        System.out.println("Size of set "+hm.size());

        //Remove value
        hm.remove(123);
        System.out.println(hm);

        //inserting not possible in hash not indexing
        //  Access specific value not possible n indexing

        hm.add(123);
        System.out.println(hm);

        //convert HashSet to ArrayList
        ArrayList al=new ArrayList(hm);
        System.out.println(al);

        //Read all elements from HashSet
        //Using normal for loop it is not possible bcz no indexing
        for(Object a:hm){
            System.out.println(a);
        }

        Iterator it=hm.iterator();

        while(it.hasNext()){
            System.out.println(it.next());
        }
        hm.clear();
        System.out.println(hm);

    }
}
