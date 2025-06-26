package Test_26June;

public class Program_03 {

    public static void main(String[] args) {

        long start=0l;
        long end=0l;
        String s="hello";
        start=System.nanoTime();
        for(int i=0;i<1000;i++){
            s.toLowerCase();
        }
        end=System.nanoTime();

        System.out.println("String  Start and end times are   "+start+"  "+end);
        System.out.println("End -  Start  "+(end-start));


        StringBuffer stringBuffer=new StringBuffer();
        start=System.nanoTime();
        for(int i=0;i<1000;i++){
            stringBuffer.append("a");
        }
        end=System.nanoTime();
        System.out.println("String Buffer Start and end times are   "+start+"  "+end);
        System.out.println("End -  Start  "+(end-start));

        StringBuilder stringbuilder=new StringBuilder();
        start=System.nanoTime();
        for(int i=0;i<1000;i++){
            stringbuilder.append("a");
        }
        end=System.nanoTime();
        System.out.println("String Builder Start and end times are  "+start+"  "+end);
        System.out.println("End -  Start  "+(end-start));
    }
}
