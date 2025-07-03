package ex_08_String;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Lab_CountDuplicateChar {
    public static void main(String[] args) {

        String str1=" dsad dsawed dsgsdf";
        String str=str1.replace(" ","");

        HashMap<Character,Integer> hm=new HashMap<Character, Integer>();

        for(int i=0;i<str.length();i++){

            char c=str.charAt(i);
           if(!hm.containsKey(c)){
               hm.put(c,1);
           }else{
               hm.put(c,hm.get(c)+1);
           }

        }

        for(Map.Entry<Character,Integer> result: hm.entrySet()) {

            if (result.getValue() > 1) {
                System.out.println(" " + result.getKey() + "  " + result.getValue());
            }
        }
    }
}
