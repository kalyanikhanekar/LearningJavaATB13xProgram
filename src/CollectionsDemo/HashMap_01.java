package CollectionsDemo;

import java.util.HashMap;
import java.util.Map;

public class HashMap_01 {
    public static void main(String[] args) {
        String str="this is java practice program";

        HashMap <Character,Integer> hm=new HashMap<>();



        for(int i=0;i<str.length();i++){

            char c=str.charAt(i);

            if(!hm.containsKey(c)){
                hm.put(c,1);
            }else if(hm.containsKey(c)){
                hm.put(c,hm.get(c)+1);
            }

        }

        for(Map.Entry<Character,Integer> h:hm.entrySet()){

            System.out.println("Key  "+h.getKey()+" Values  "+h.getValue());

        }

        System.out.println(hm);

    }



}
