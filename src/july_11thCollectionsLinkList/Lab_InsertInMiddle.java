package july_11thCollectionsLinkList;

import java.util.LinkedList;
import java.util.List;

public class Lab_InsertInMiddle {
    public static void main(String[] args) {


        List fruit=new LinkedList();

        fruit.add("Apple");
        fruit.add("Banana");
        fruit.add("Mango");
        System.out.println(fruit);
        fruit.add(1,"Orange");
        System.out.println(fruit);

    }
}
