package july_11thCollectionsArrayList;

import java.util.ArrayList;
import java.util.List;

public class Lab_RemoveFromArraylist {
    public static void main(String[] args) {
        List name=new ArrayList();

        name.add("amit");
        name.add("Neha");
        name.add("Suresh");

        System.out.println(name);

        name.remove(1);
        System.out.println("After removing "+name);



    }
}
