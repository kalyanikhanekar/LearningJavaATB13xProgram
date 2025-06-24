package ex_09_StringBuilder_StringBuffer;

public class Lab_TimeComparison {
    public static void main(String[] args) {

        long start=0l;
        long end=0l;

        StringBuffer stringBuffer=new StringBuffer();
        start=System.nanoTime();
        for(int i=0;i<100;i++){
            stringBuffer.append("a");
        }
        end=System.nanoTime();
        System.out.println("String Buffer Start and end times are   "+start+"  "+end);
        System.out.println("End -  Start  "+(end-start));

        StringBuilder stringbuilder=new StringBuilder();
        start=System.nanoTime();
        for(int i=0;i<100;i++){
            stringbuilder.append("a");
        }
        end=System.nanoTime();
        System.out.println("String Builder Start and end times are  "+start+"  "+end);
        System.out.println("End -  Start  "+(end-start));
    }
}
