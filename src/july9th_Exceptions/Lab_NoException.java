package july9th_Exceptions;

public class Lab_NoException {
    public static void main(String[] args) {

        String s = "the testing is going on";
        try {
            String s1 = s.trim();
        }
        finally {
            System.out.println("this will execute anyhow!!!!");
        }
    }
}