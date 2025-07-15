package july15th_Map;

import java.util.HashMap;
import java.util.Map;

public class Lab_countFreqEachWord {
    public static void main(String[] args) {
        String str="java is easy and java is powerful";
        String arr[]=str.split(" ");
        System.out.println(arr.length);
        HashMap<String,Integer> hm=new HashMap<>();

        for(int i=0;i<arr.length;i++){

           String s=arr[i];
           if(!hm.containsKey(s)){
               hm.put(s, 1);
           }else{
               hm.put(s,hm.get(s)+1);
           }
        }
        for(Map.Entry<String,Integer> obj:hm.entrySet()){
            System.out.println(obj.getKey()+"  -> "+obj.getValue());
        }
    }
}
