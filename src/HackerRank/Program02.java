package HackerRank;

import javax.swing.plaf.synth.SynthTabbedPaneUI;
import java.util.Scanner;

public class Program02 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s1[] = new String[10];
        int x[] = new int[10];
        System.out.println("================================");
        for(int i=0;i<3;i++){
            s1[i]=sc.next();
            x[i]=sc.nextInt();
        }
        for(int i=0;i<3;i++){
            //Complete this line
          /*  System.out.print(s1[i]);
            int space=15-s1.length;
            while(space>0){
                System.out.print(" ");
                space--;
            }
*/
            System.out.print(" "+s1[i]+"\t");
            if(x[i]<100){
                String str=Integer.toString(x[i]);

                str="0"+str;
                System.out.println(str);
            }
            else
                System.out.println(x[i]);
        }
    }
    // System.out.println("================================");
    // sc.close();
    }

