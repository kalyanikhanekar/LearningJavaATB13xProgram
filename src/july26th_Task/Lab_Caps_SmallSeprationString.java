package july26th_Task;
//Java program to gives two Output: “abcde”, “ABCDE” for the Input String Str = “aBACbcEDed”
public class Lab_Caps_SmallSeprationString {
    public static void main(String[] args) {

        String str ="aABCbcEDed";

        String caps="";
        String small="";

        for(int i=0;i<str.length();i++){

            char c=str.charAt(i);
            if(c>=65 && c<=90){
                caps+=c;
            }else{
                small+=c;
            }

        }
        System.out.println("Small  "+small+"\ncaps  "+caps);

    }
}
