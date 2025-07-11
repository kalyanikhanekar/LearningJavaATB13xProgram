package july_11thCollectionsArrayList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Lab_PerformanceArrayListAndLinklist {

    public static void main(String[] args) {

        ArrayList arraylist=new ArrayList();
        LinkedList linklist=new LinkedList();

        //ArrayList
        long arraystarttime=System.currentTimeMillis();
        for(int i=0;i<100000;i++){
            arraylist.add(i);
        }
        long arrayendttime=System.currentTimeMillis();

        //LinkList
        long liststarttime=System.currentTimeMillis();
        for(int i=0;i<100000;i++){
            linklist.add(i);
        }
        long listendttime=System.currentTimeMillis();

        System.out.println("Arrays time required " +((arrayendttime-arraystarttime))+"  milisec");
        System.out.println("LinkList time required " +((listendttime-liststarttime))+"  milisec");
    }
}
