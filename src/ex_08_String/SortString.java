package ex_08_String;

import java.util.Arrays;

public class SortString {

    public static void main(String[] args) {
        String str = "the testing";
        String str1 = str.replaceAll("\\s", "");
        int len = str1.length();
        char[] arr = str1.toCharArray();
        for (int i = 0; i < str1.length() - 1; i++) {

            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    char temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }


            }

        }
        System.out.println(Arrays.toString(arr));
    }
}
