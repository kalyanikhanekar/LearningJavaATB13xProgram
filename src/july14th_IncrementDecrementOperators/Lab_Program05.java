package july14th_IncrementDecrementOperators;

public class Lab_Program05 {
    public static void main(String[] args) {
        int a = 110;

        int b = a--;

        System.out.println("the value of b is " +b);//110

        int d = --a;

        System.out.println("the value of D is " + d);//108

        System.out.println("the value of A is " +a);//108

        int l= b--;

        System.out.println("the value of l is " +l);//110

        System.out.println("the value of b is " +b);//109

        int s = d-- + --b;

        System.out.println("the value of S is " +s);//216

        s = --d + --b;

        System.out.println("the value of S is " +s);//213

        System.out.println("the value of b is " +b);//107

        System.out.println("what will be the value of "+ b++);//107

        System.out.println("what will be the value of "+ ++b);//109

        System.out.println("what will be the value of "+ b--);//109

        System.out.println("what will be the value of "+ --b);//107
    }
}
