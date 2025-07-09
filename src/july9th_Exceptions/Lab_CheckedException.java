package july9th_Exceptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Lab_CheckedException {
    public static void main(String[] args) {

        try {
            FileInputStream file = new FileInputStream("C:\\textabc.txt");


        }catch (FileNotFoundException f){
            System.out.println(f.getMessage());
        }
    }
}
