package july_11thCollectionsArrayList;

import java.util.*;

public class Lab_RemoveDuplicateFormList {
    public static void main(String[] args) {
        ArrayList<Integer> list=new ArrayList();

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the how many array elements you want");
        int n=sc.nextInt();

        for(int i=0;i<n;i++){
            System.out.println("Enter the value");
            list.add(sc.nextInt());
        }
        //using map
        HashMap<Integer,Integer> hm=new HashMap<>();
        for(int i=0;i<n;i++){
            int c= list.get(i);
            if(!hm.containsKey(c)){
                hm.put(c,1);
            }else{
                hm.put(c,hm.get(c)+1);

            }
        }

        System.out.println(list);

        Iterator<Map.Entry<Integer, Integer>> it=hm.entrySet().iterator();
        while(it.hasNext()){
            Map.Entry<Integer, Integer> entry = it.next();
            if(entry.getValue()>1){

               it.remove();
            }
        }

        System.out.println(hm);




        //using set
//        Set s=new HashSet();
//
//        s.addAll(list);
//        System.out.println(s);





}
}
