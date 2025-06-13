package ex_06_Increment_Decrement;

public class Lab_PreIncrement01 {
    public static void main(String[] args) {
        int i=11;
        int j=10;
        i=++i + i++;
        System.out.println(i);
        j=j++ + ++j;
        System.out.println(j);

    }
}
