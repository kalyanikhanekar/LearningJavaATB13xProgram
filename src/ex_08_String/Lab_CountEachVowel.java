package ex_08_String;

import java.util.HashMap;
import java.util.Map;

public class Lab_CountEachVowel {
    public static void main(String[] args) {
        String str="Learning automation is easy";
        HashMap<Character,Integer> hm=new HashMap<>();

        str=str.replace(" ","");

        for(int i=0;i<str.length();i++){

            char c=str.charAt(i);
            if(c=='a' || c=='i' || c=='e' || c=='o' || c=='u'){
                if(!hm.containsKey(c)){
                    hm.put(c,1);

                }else{
                    hm.put(c,hm.get(c)+1);
                }
            }

        }

        for(Map.Entry<Character,Integer> obj:hm.entrySet()){
            char c=obj.getKey();
            if(c=='a' || c=='i' || c=='e' || c=='o' || c=='u'){
                System.out.println(" Vowel "+c+"  "+obj);
            }

        }
    }
}
