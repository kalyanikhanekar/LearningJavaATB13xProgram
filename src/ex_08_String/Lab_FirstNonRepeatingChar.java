package ex_08_String;

import java.util.HashMap;
import java.util.Map;

public class Lab_FirstNonRepeatingChar {
    public static void main(String[] args) {
        String str="aaaabbbcdeeeffg";
        HashMap<Character,Integer> hm=new HashMap<>();
        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);

            if(!hm.containsKey(c)){
                hm.put(c,1);
            }else{
                hm.put(c, hm.get(c)+1);
            }

        }

        for(Map.Entry<Character,Integer> obj:hm.entrySet()){
            if(obj.getValue()==1){
                System.out.println("First Non repeating Char "+obj.getKey()+"-> "+obj.getValue());
                break;
            }
        }
    }
}
