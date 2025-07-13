package ex_08_String;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

//lenght and character count should be equal
public class Lab_stringanagrams {


    public static void main(String[] args) {
        String str1="acbbaa";
        String str2="abbacc";

        HashMap<Character,Integer> hm1=new HashMap<>();
        HashMap<Character,Integer> hm2=new HashMap<>();
        if(str1.length()!=str2.length()){
            System.out.println("First condition fail, lenght is not equal ");
            return;
        }


            for(int i=0;i<str1.length();i++){
                char c=str1.charAt(i);
                if(!hm1.containsKey(c)){
                    hm1.put(c,1);
                }else{
                    hm1.put(c, hm1.get(c)+1);
                }
            }

            for(int i=0;i<str2.length();i++){
                char c=str2.charAt(i);
                if(!hm2.containsKey(c)){
                    hm2.put(c,1);
                }else{
                    hm2.put(c, hm2.get(c)+1);
                }
            }
            int flag=1;
           for(Map.Entry<Character,Integer> object:hm1.entrySet()){
             char c= object.getKey();


                   if(!hm2.containsKey(c)) {
                       flag = 0;
                       break;
                   }
                   else if(hm2.containsKey(c)){

                       int c1= object.getValue();
                       int c2=hm2.get(c);
                       if(c1!=c2){
                           flag=0;
                           break;
                       }
                   }

               }


        System.out.println("first   String is "+str1 );
        System.out.println("Second  String is "+str2 );
           if(flag==0) {
               System.out.println(str1 + " " + str2 + "  not anagrams");
           }
               else{
               System.out.println(" "+str1 + "    \t" + str2 + "   \t String are anagrams");
               }
           }

    }


