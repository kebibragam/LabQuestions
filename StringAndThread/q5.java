// Create two classes ThreadA and ThreadB by implementing the runnable interface. ThreadA displaysall even numbers from 50 to 100 and ThreadB displays all odd numbers from 100 to 200. Define amain class which creates the objects of both the classes and displays the numbers as per the abovementioned specifications.

package Java.LabQuestions.StringAndThread;

class ThreadA extends Thread{
    public void run(){
        try {
            for(int i =50; i<100; i++){
                if (i%2==0) {
                   System.out.println(i);
                   sleep(1000);
                }
            }
        } catch (Exception e) {
           
        }
    }
}
class ThreadB extends Thread{
    public void run(){
        try {
            for(int i =100; i<200; i++){
                if (i%2==1) {
                   System.out.println(i);
                   sleep(1000);
                }
            }
        } catch (Exception e) {
           
        }
    }
}


public class q5 {
    public static void main(String[] args) {
        ThreadA obj1= new ThreadA();
        ThreadB obj2 = new ThreadB();
        obj1.start();
        obj2.start();
    }
}