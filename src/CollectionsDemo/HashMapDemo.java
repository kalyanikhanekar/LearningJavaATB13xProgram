package CollectionsDemo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapDemo {
    public static void main(String[] args) {

        //Declaration   when we have key and value pair then used this collection
        // keys should not be duplicate values can be
        HashMap hm=new HashMap();
        HashMap <Integer,String> hm1=new HashMap<>();
        Map mp=new HashMap();

        hm.put('A',"aaa");
        hm.put('B',"bbb");
        hm.put(3,234);

        System.out.println(hm);

        hm1.put(1,"kalyani");
        hm1.put(2,"Snehal");
        hm1.put(3,"Joyti");
        hm1.put(4,"Monali");
        hm1.put(6,"komal");
        hm1.put(3,"geeta");

        System.out.println(hm1);
        //size()
        System.out.println(hm1.size());

        hm1.remove(3);
        System.out.println("After removing"+hm1);

        //Access Value of key
        hm1.get(4);
        System.out.println(hm1);

        //get All keys from HashMap
        System.out.println(hm1.keySet());

        // Get all values
        System.out.println(hm1.values());

        //Get both key and value
        System.out.println(hm1.entrySet());

        //Printing data using for each loop, normal for loop not work no indexing

        for(int k:hm1.keySet()){

            System.out.println(k+"    "+hm1.get(k));
        }

        //using iterator

        Iterator<Map.Entry<Integer, String>> it = hm1.entrySet().iterator();

        while(it.hasNext()){
           Map.Entry el= it.next();

            System.out.println(" "+el.getKey()+" "+el.getValue());
        }




    }
}
