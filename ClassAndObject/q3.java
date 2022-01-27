//Write a program to demonstrate method overloading and constructor overloading

package Java.LabQuestions.ClassAndObject;

 class test{
    test(){
        System.out.println("Test is created.");
    }
    test(String name){
        
        System.out.println("Hello "+ name);
    }
    void getArea(int l){
        System.out.println("Area of Square is "+ l*l);
    }
    
    void getArea(int l, int b){
        System.out.println("Area of Rectangle is "+ l*b);
    }
    
}

public class q3 {
    public static void main(String[] args) {
        test t = new test();
        
        t.getArea(2,3);

    }
}
