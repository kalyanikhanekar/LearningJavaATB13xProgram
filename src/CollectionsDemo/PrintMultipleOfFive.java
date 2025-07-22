package CollectionsDemo;

import java.util.ArrayList;
import java.util.List;

public class PrintMultipleOfFive {
    public static void main(String[] args) {

        List <Integer> list=new ArrayList<>();

        list.add(23);
        list.add(20);
        list.add(21);
        list.add(55);
        list.add(751);
        list.add(145);
        list.add(234);
        list.add(560);

        for(int i=0;i<list.size();i++){

           // int a=list.get(i);
            if(list.get(i)%5==0){
                System.out.println("Multiple of 5 "+list.get(i));

            }else {
                System.out.println("Not Multiple of 5 "+list.get(i));
            }
        }




    }
}
