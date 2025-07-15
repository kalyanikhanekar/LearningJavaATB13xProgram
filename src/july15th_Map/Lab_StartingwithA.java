package july15th_Map;

import java.util.HashMap;
import java.util.Map;

public class Lab_StartingwithA {
    public static void main(String[] args) {
        HashMap<Integer,String> hm=new HashMap<>();

        hm.put(101,"Sonal");
        hm.put(102,"Anjali");
        hm.put(106,"Kalyani");
        hm.put(105,"Amol");
        hm.put(103,"Anita");

        for(Map.Entry<Integer,String> obj:hm.entrySet()){

            String s=obj.getValue();
            if(s.charAt(0)=='A'){
                System.out.println(obj.getKey()+" -> "+obj.getValue());
            }

        }

    }
}

