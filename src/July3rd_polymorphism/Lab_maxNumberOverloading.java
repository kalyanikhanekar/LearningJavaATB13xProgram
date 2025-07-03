package July3rd_polymorphism;

public class Lab_maxNumberOverloading {
    public static void main(String[] args) {
        maxClass max=new maxClass();
        int a=45;
        int b=67;
        int c=54;
        int d=34;
        int f=98;
     int m1=   max.maximumNumber(a,b);
      int m2=  max.maximumNumber(c,d,f);
        System.out.println("Maximum if "+a+" "+b+"  is "+m1);
        System.out.println("Maximum if "+c+" "+d+" "+f+"  is "+m2);


    }
}
class maxClass{

   int  maximumNumber(int a,int b){
       if(a>b){
           return a;
       }else {
           return b;
       }

    }
    int maximumNumber(int a,int b,int c){
        int max= (a>b&&a>c)?a:(b>a&&b>c?b:c);
        return  max;
    }




}