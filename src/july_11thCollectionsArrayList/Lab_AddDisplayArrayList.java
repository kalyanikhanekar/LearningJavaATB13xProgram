package july_11thCollectionsArrayList;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Lab_AddDisplayArrayList {
    public static void main(String[] args) {

        List student = new ArrayList();
        student.add("Dipak");
        student.add("Ravi");
        student.add("Sneha");
        student.add("Priya");
        student.add("Anjali");

        //display using traditional for loop
        for (int i = 0; i < student.size(); i++) {
            System.out.println(student.get(i));
        }

        //display using for each loop
        for (Object s : student) {
            System.out.println(s);

        }

        //Iterator

        Iterator iterator = student.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }
}
