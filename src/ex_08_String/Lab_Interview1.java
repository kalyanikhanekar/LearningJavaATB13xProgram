package ex_08_String;

import java.util.HashMap;
import java.util.Map;
/*
print middle non-repeating string
 */
public class Lab_Interview1 {
    public static void main(String[] args) {


        String str="switchas switches que testing";
        int flag=0;
        String newstr="";

       str.replace(" ","");
        int len=str.length();
        HashMap <Character,Integer> hm=new HashMap<>();

        for(int i=0;i<str.length();i++){

            char c=str.charAt(i);

            if(!hm.containsKey(c)){
                hm.put(c,1);
            }else if(hm.containsKey(c)){
                hm.put(c,hm.get(c)+1);
            }

        }




        for(Map.Entry<Character,Integer> e:hm.entrySet()){

            if(e.getValue()==1){

              newstr+=e.getKey();

            }

        }

        System.out.println(newstr);
        int mid=newstr.length()/2;
        System.out.println("Middle string  "+newstr.charAt(mid));

    }

}
