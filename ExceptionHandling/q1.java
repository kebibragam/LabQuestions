//Write a program in java to handle the divide by zero exception

package Java.LabQuestions.ExceptionHandling;

public class q1 {
    public static void main(String[] args){
        try {
            System.out.println(3/0);
            
        } catch (Exception e) {
            // e.getStackTrace(e);
            System.out.println(e);
        }
    }
}