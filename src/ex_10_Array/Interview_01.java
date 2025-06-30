package ex_10_Array;

/*
How to reverse an array in the subset of N? e.g.
Input: [111,113,115,227,229,237,515,517,519],
Output: [115,113,111,237,229,227,519,517,515].
 */
public class Interview_01 {
    public static void main(String[] args) {
        int sunsetcnt=3;

        int arr[]= {111,113,115,227,229,237,515,517,519};
        int a1[]=new int [arr.length];
        int a2[]=new int [arr.length];
        int newarry[]=new int [arr.length];
        int leng=0;
        int subsetcount =3;
        int each_subset_element=arr.length/3;
        int newcounter=0;
        int i=0;
        int p=0;
        while (subsetcount >0){

            i=i+a1.length;

            for(; i< each_subset_element; i++){

                a1[i]=arr[p];
                p++;
            }

            for(int j=a1.length-1;j>=0;j--)
                newarry[newcounter]=a1[j];
            }
        each_subset_element = each_subset_element *2;

        }
    }

