package ex_08_String;

public class test1 {
    public static void main(String[] args) {
        String a="abc@#%hgyt@#%dkdhjhk@#%kdhkdhhs k@#%dhkjdhfkhfk@#%";

        System.out.println((a.split("@#%").length)-1);
    }
}
