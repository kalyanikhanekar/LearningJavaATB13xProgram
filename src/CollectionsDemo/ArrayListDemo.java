package CollectionsDemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {

        //Declaration of ArrayList
        // 1
        ArrayList mylist=new ArrayList();

        // 2  List is parent class of ArrayList so it is allowed to child class object
       // parent class reference

        List mylist2=new ArrayList();


        //3 it is specifically hold only interger type of data
        ArrayList <Integer> mylist3=new ArrayList<Integer>();

        // add data into ArrayList

        mylist.add("Kalyani");
        mylist.add(3);
        mylist.add('C');
        mylist.add(true);
        mylist.add(null);

        //size of arraylist
        System.out.println("ArrayList Size "+mylist3.size());

        //print ArrayList
        System.out.println(mylist);

        //remove from ArrayList
        mylist.remove(3);

        //insert new element
        mylist.add(3,"Java");

        //Modify Element in ArrayList
        mylist.set(2,"hello");

        //Access specific element from ArrayList
        System.out.println(mylist.get(3));

        //Reading all elements one by one
        // Normal for loop
        System.out.println("Printing using normal for loop");
        for(int i=0;i<mylist.size()-1;i++){
            System.out.println(mylist.get(i));
        }

        //For Each loop
        System.out.println("Printing using for each loop");
        for(Object element:mylist){
            System.out.println(element);
        }

        System.out.println("Printing using Iterator");
        //By using iterator , this is only used of collections like ArrayList,List, HashSet...
        Iterator list=mylist.iterator();

        while(list.hasNext()){
            System.out.println(list.next());
        }

    }
}
