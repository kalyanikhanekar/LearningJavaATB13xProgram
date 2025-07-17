package july15th_Map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Lab_GroupWordsbyLengthUsingMap {
    public static void main(String[] args) {
        String str[]={"Java", "is", "fun", "cool", "Hi"};

        HashMap<Integer, List<String>> hm=new HashMap<>();
            String a[]=new String[str.length];
            int j=0;
        for(int i=0;i<str.length;i++){
            String s=str[i];
            int len=s.length();
            if(!hm.containsKey(len)){
                hm.put(len,new ArrayList<String>());
            }
            hm.get(len).add(s);//most important step


        }
        for(Map.Entry<Integer,List<String>>obj:hm.entrySet()){

            System.out.println(obj.getKey()+" -> "+obj.getValue());
        }

    }
}
