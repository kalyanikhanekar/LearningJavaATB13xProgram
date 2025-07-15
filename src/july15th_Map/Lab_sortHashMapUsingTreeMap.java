package july15th_Map;

import java.util.HashMap;
import java.util.TreeMap;

public class Lab_sortHashMapUsingTreeMap {
    public static void main(String[] args) {
        HashMap<String,Integer> hm=new HashMap<>();

        TreeMap tm=new TreeMap();

        hm.put("Sonali",78);
        hm.put("Kalyani",90);
        hm.put("Anjali",95);
        System.out.println(hm);
        tm.putAll(hm);

        System.out.println(tm);
    }
}
