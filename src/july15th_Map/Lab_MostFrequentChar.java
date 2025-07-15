package july15th_Map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Lab_MostFrequentChar {
    public static void main(String[] args) {
        String s="aaaabbbbbcc";

        HashMap<Character,Integer> hm=new HashMap<>();
        int max=0;
       char ch;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);

            if(!hm.containsKey(c)){
                hm.put(c,1);

            }else{
                hm.put(c,hm.get(c)+1);

            }
            if(max<hm.get(c)){
                max=hm.get(c);
            }

        }

      for(Map.Entry<Character,Integer> obj:hm.entrySet()){

          if(obj.getValue()==max){
              System.out.println(obj.getKey()+" -> "+obj.getValue());
          }
      }

    }
}
