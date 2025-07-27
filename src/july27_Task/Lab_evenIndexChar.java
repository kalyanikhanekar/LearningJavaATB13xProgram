package july27_Task;

public class Lab_evenIndexChar {
    public static void main(String[] args) {
        String str="the string is testing";

        for(int i=0;i<str.length();i++){

            if(i%2==0){
                System.out.print("   "+str.charAt(i)+"  index is " +i);
            }
            System.out.println();
        }
    }
}
