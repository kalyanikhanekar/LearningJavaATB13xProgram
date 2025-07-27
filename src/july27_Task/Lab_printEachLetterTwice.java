package july27_Task;

public class Lab_printEachLetterTwice {
    public static void main(String[] args) {
        String str="kalyani";

        for(int i=0;i<str.length();i++){
            System.out.print("   "+str.charAt(i)+"     "+str.charAt(i));
        }
    }
}
