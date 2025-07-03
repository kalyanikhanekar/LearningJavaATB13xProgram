package ex_08_String;

public class Lab_Vowels_Consonants_Digits_Spaces {
    public static void main(String[] args) {

        String str="dsad edjiwod4234 dsadas 5453r";
        Lab_Vowels_Consonants_Digits_Spaces sp=new Lab_Vowels_Consonants_Digits_Spaces();
        int vowel_count =sp.count_vowels(str);
        int consonant_count=sp.count_consonants(str);
        int digit_count=sp.count_digits(str);
        int spaces_count=sp.count_spaces(str);

        System.out.println("Vowels  "+vowel_count);
        System.out.println("Consonants  "+consonant_count);
        System.out.println("Digits   "+digit_count);
        System.out.println("Spaces  "+spaces_count);
    }

    int count_vowels(String str){

        int count=0;

        for(int i=0;i<str.length();i++){
            char c=str.toLowerCase().charAt(i);
            if(c=='a' || c=='e' || c=='i' || c=='o' || c=='u'){
                count++;
            }
        }
        return count;

    }

    int count_consonants(String str){
        int count=0;
        for(int i=0;i<str.length();i++){
            char c=str.toLowerCase().charAt(i);
            if(c>='a' && c<='z'){
                count++;
            }
        }

        return count;

    }
    int count_digits(String str){
        int count=0;
        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
            if(c>48 && c<57){
                count++;
            }
        }
        return count;
    }

    int count_spaces(String str){
        int count=0;
        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
            if(c==' '){
                count++;
            }
        }
        return count;
    }

}

