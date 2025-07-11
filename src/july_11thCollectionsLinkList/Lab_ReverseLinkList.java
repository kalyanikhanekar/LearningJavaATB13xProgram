package july_11thCollectionsLinkList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Lab_ReverseLinkList {
    public static void main(String[] args) {


        List num=new LinkedList();

        num.add(10);
        num.add(20);
        num.add(30);
        num.add(40);
        System.out.println(num);
       // num=num.reversed();
        System.out.println(num);
        //Another way convert LinkList to array list and print reverse
        ArrayList list=new ArrayList(num);
        System.out.print("[");
        for(int i=list.size()-1;i>=0;i--){
            System.out.print(list.get(i)+",");


        }

        System.out.println("]");
    }
}
