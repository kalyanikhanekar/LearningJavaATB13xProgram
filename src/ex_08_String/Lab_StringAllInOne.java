package ex_08_String;

import java.util.HashMap;
import java.util.Map;

/*
1. Count the number of vowels, consonants, digits, and special characters in a string.
2.Check if two strings are anagrams.
Input: "listen", "silent" → Output: true
3.Remove all duplicate characters from a string.
4.Split a string into words and reverse each word
 */
public class Lab_StringAllInOne {

    public static void main(String[] args) {

        StringBuilder str=new StringBuilder("hello435345#@$#");
        Lab_StringAllInOne obj=new Lab_StringAllInOne();
       // obj.countVowelConsonentsDigitSpecialChar(str);
      //  obj.stringAnagram(new StringBuilder("listen"), new StringBuilder("silant"));
     //  obj.removeDuplicateChar("characters ");
       // obj.firstNonRepeating("swiss");
        //obj.reverseEachWord("Java is fun");
        obj.longestWord("Java is fun");



    }


    void countVowelConsonentsDigitSpecialChar(StringBuilder str){

        int vowel=0;
        int consonents=0;
        int specialchar=0;
        int digit=0;

        for(int i=0;i<str.length();i++){

            char c=str.charAt(i);

            if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u'){
                vowel++;
            }else if(c>=65 && c<=90 || c>=97 && c<=120){
                consonents++;
            }else if(c>=47 && c<=56){
                digit++;
            }else{
                specialchar++;
            }

        }
        System.out.println("Vowels  "+vowel+"\n"+"Consonants  "+consonents+"\n Digits "+digit+"\nSpecilChatacter "+specialchar);
    }

    void stringAnagram(StringBuilder str,StringBuilder str1){


        if(str.length()!=str1.length()){
            System.out.println("Length not equal  will not proceed");
            return;
            }
            else{

                HashMap<Character,Integer> hm1=new HashMap<>();
                HashMap<Character,Integer> hm2=new HashMap<>();

                for(int i=0;i<str1.length();i++){
                    char d=str.charAt(i);
                    char c=str1.charAt(i);
                    if(!hm1.containsKey(c)){
                        hm1.put(c,1);
                    }else{
                        hm1.put(c,hm1.get(c)+1);
                    }

                    if(!hm2.containsKey(d)){
                        hm2.put(d,1);
                    }else{
                        hm2.put(d,hm2.get(d)+1);
                    }

            }

                int flag=0;
                for(Map.Entry<Character,Integer> obj:hm1.entrySet()){
                    char c=obj.getKey();
                    if(!hm2.containsKey(c)){
                        flag=1;
                        break;
                    }else{
                        if(hm2.containsKey(c)){
                            int c1=obj.getValue();
                            int c2=hm2.get(c);
                            if(c1!=c2){
                                flag=1;
                                break;
                            }

                        }
                    }

                }

            System.out.println("first   String is "+str1 );
            System.out.println("Second  String is "+str );
            if(flag==1) {
                System.out.println(str1 + " " + str + "  not anagrams");
            }
            else{
                System.out.println(" "+str1 + "    \t" + str + "   \t String are anagrams");
            }


        }

    }


    void removeDuplicateChar(String str){


        HashMap<Character,Integer> hm=new HashMap<>();

        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);

            if(hm.containsKey(c)){
                hm.put(c,hm.get(c)+1);
            }else{
                hm.put(c,1);
            }
        }
        String strnew="";
        for(Map.Entry<Character,Integer> obj: hm.entrySet()){

            if(obj.getValue()==1){
                strnew=strnew+obj.getKey();
            }
        }
        System.out.println(str);
        System.out.println(strnew);

    }

    void firstNonRepeating (String str){

        HashMap<Character,Integer> hm=new HashMap<>();

        for(int i=0;i<str.length();i++) {
            char c = str.charAt(i);

            if (hm.containsKey(c)) {
                hm.put(c, hm.get(c) + 1);
            } else {
                hm.put(c, 1);

            }
        }

        char r=0;
        for(Map.Entry<Character,Integer> obj: hm.entrySet()){

            int c=obj.getValue();

            if(c==1){
                r=obj.getKey();
                break;
            }


            }

        System.out.println(hm);

        System.out.println("First non repeateding char "+r);



    }

    //Split a string into words and reverse each word
    void reverseEachWord(String str){

        String array[]=str.split(" ");
        String arraynew[];
        for(int i=0;i<array.length;i++){
            for(int j=array[i].length()-1;j>=0;j--){
                System.out.print(array[i].charAt(j));
            }
            System.out.print("\t");

        }
    }

    //longest word
    void longestWord(String str){


        String array[]=str.split(" ");
        int max=0;
        int k=0;
        int index=0;
        for(int i=0;i<array.length;i++){
            for( int j=0;j<array[i].length();j++) {
             k++;
                if(max<k){
                    max=k;
                    index=i;

                }
            }

        }

        System.out.println("Longest word is "+array[index]);
    }

}


