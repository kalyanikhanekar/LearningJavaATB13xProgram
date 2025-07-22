package ex_10_Array;

/*
[111,113,115,227,229,237,515,517,519],
Output: [115,113,111,237,229,227,519,517,515].
 */
public class Interview_01 {
    public static void main(String[] args) {
        int[] input = {111, 113, 115, 227, 229, 237, 515, 517, 519};
        int groupSize = 3;
        int[] output = new int[input.length];

        int index = 0;// for new array indexing

        for (int i = 0; i < input.length; i += groupSize) {
            /* this loop increased by groupsize means
             skipping // element of each sub array count
             which we are traveling in nested for loop*/

           // Reverse group manually
            for (int j = groupSize - 1; j >= 0; j--) {
                output[index++] = input[i + j];
            }
        }

        for(int a:output){
            System.out.println("   " +a);
        }
    }
}


