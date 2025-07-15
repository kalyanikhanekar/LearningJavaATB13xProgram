package july15th_Map;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Lab_IterateOverHashMap {
    public static void main(String[] args) {

    //"Name" -> "Dipak", "Role" -> "Tester", "Level" -> "Senior"
        HashMap<String,String> hm=new HashMap();
        hm.put("Name","Kalyani");
        hm.put("Role","Tester");
        hm.put("Level","Senior");

        //entryset

        for(Map.Entry<String,String> obj:hm.entrySet()){

            System.out.println(obj.getKey()+" - > "+obj.getValue());
        }


        //keyset
        for(String obj:hm.keySet()){
            System.out.println(obj+" -> "+hm.get(obj));
        }
        //iterator
        Iterator it=hm.entrySet().iterator();
        while(it.hasNext()){
            System.out.println(it.next());

        }
    }
}
