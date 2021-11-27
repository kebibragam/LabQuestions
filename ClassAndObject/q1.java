//Write a program that creates a class MyPoint which contains data members x and y(double type) to represent x-coordinate and y-coordinate . Create two instances of MyPoint class and show the distancebetween those point objects

package Java.LabQuestions.ClassAndObject;

public class q1 {
    public static void main(String[] args) {
        MyPoint p1 = new MyPoint(5,3);
        System.out.println(p1);
        MyPoint p2 = new MyPoint(3, 2);
        System.out.println(p2);
        Distancebetween d = new Distancebetween(p1, p2);
    
    }
}

class MyPoint{
    public double x;
    public double y;

    public MyPoint(double x, double y) {
        this.x =x;
        this.y = y;
    }
}
class Distancebetween{
    Distancebetween(MyPoint a,MyPoint b){
        double i = a.x - b.x;
        double j = a.y - b.y;
        System.out.println("Distance between these point is ("+ i +","+ j + ").");
    }
}


