package CollectionsDemo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListBasics {

    public static void main(String[] args) {

        //Declaration Of ArrayList 3 ways
        ArrayList al=new ArrayList();//1st way
        List alist=new ArrayList();//2nd way List is parent of ArrayList Class
        ArrayList<String> astring=new ArrayList<String>();//restrict to string only

        al.add("Kalyani");
        al.add("Khanekar");
        al.add(100);
        al.add('C');
        al.add(true);
        al.add(35.6);

        System.out.println("Array List is "+al)
        ;

        //size()

        System.out.println("Size pf ArrayList is "+al.size());

        //remove()
        System.out.println("Remove element from array "+al.remove(3));

        //add element at mid
        al.add(3,"new element");
        System.out.println("New element added "+al);

        //get specific element
        System.out.println(al.get(4));

        //Replace the element
        System.out.println(al.set(3,"replace"));

        //search any element in ArrayList
       boolean b= al.contains("Kalyani");
        System.out.println(b);//true

        //isEmpty();
        System.out.println(al.isEmpty());//false bcz AL have elements

        //Read data from ArrayList
        // for loop
        for (int i=0;i<al.size()-1;i++){
            System.out.println(al.get(i));
        }

        //for each
        for(Object e:al){
            System.out.println(e);

        }

        //Iterator

        Iterator it=al.iterator();

        while(it.hasNext()){
            System.out.println(it.next());
        }



    }
}
