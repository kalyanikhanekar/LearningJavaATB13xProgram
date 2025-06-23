package ex_01_Java_Basic;

public class Lab_Interview02 {
    public static void main(String[] args) {
        try{

            int num1 = 2;

            int num2 =0;

            int div = num1/num2;

            System.out.println(div);
        }

        catch(Exception e){

            System.out.println(e.getMessage());

        }

      /*  catch( ArithmeticException e1){

            System.out.println(e1.getMessage());

        }*/
    }
}
/* output
ERROR!
Main.java:27: error: exception ArithmeticException has already been caught
catch(ArithmeticException e1){
^
1 error



*************************************explanation*******************************
What Happens?
Step 1: int div = 2 / 0; → This causes an ArithmeticException at runtime (/ by zero).

Step 2: Java tries to handle it using the first catch block that matches.

BUT... you cannot place catch(Exception e) before catch(ArithmeticException e1).

Why?
Because ArithmeticException is a child class of Exception, and Java thinks:

"You already caught the parent, so the child will never be reached."

This results in a compile-time error, not a runtime error.

❌ Output/Error:
The program will not compile.
You will get:

go
Copy
Edit
error: exception ArithmeticException has already been caught
✅ Correct Code (Reversed catch blocks):
java
Copy
Edit
try {
    int num1 = 2;
    int num2 = 0;
    int div = num1 / num2;
    System.out.println(div);
}
catch (ArithmeticException e1) {
    System.out.println(e1.getMessage());
}
catch (Exception e) {
    System.out.println(e.getMessage());
}
✅ Correct Output:
csharp
Copy
Edit
/ by zero
 */