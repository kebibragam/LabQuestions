//Create   an   abstract   class   Shape   with   abstract   method   double   getArea().   Create   child   classesRectangle, Square and Circle which extends Shape class where:
    // i) class Square has member variable double length and overridden method double getArea() whichreturns area of Square object.
    
    // ii)class Rectangle has member variables double length and double breadth and an overridden method double getArea() which returns area of Rectangle object.
    
    // iii)class   Circle   has   member   variable   double   radius   and   overridden   method   double   getArea()   whichreturns area of Circle object.[hint: you can use constructor in child classes to initialize their variables.)
    // Create an array of type Shape to hold 10 objects(e.g Shape s[]=new Shape[10]) which holds differenttypes   of   objects   like   rectangle   object,   square   object   or   circle   object.   Finally   print   the   areas   of   theobjects present in the Shape array

package Java.LabQuestions.Inheritance;

/**
 * Shape
 */
abstract class Shape {
    abstract double getArea(double l, double b);
}


// i) class Square has member variable double length and overridden method double getArea() whichreturns area of Square object.
    
class Square implements Shape{
    double length;
    double getArea(double l){
        this.length = l;
        double Area = l*l;
        return Area;
    }
}
// ii)class Rectangle has member variables double length and double breadth and an overridden method double getArea() which returns area of Rectangle object.
    
class Rectangle implements Shape{
    double length , breadth;
    
    double getArea(double l, double b){
        this.breadth =b;
        this.length =l;
        double Area = l*b;
        return Area;
    }

}
// iii)class   Circle   has   member   variable   double   radius   and   overridden   method   double   getArea()   whichreturns area of Circle object.[hint: you can use constructor in child classes to initialize their variables.)
 

class Circle implements Shape{
    double radius;
    double getArea(double r){
        this.radius = r;
        double Area = 2*3.1*r*r;
        return Area;
    }
}

public class q2 {
    public static void main(String[] args){
        // Create an array of type Shape to hold 10 objects(e.g Shape s[]=new Shape[10]) which holds differenttypes   of   objects   like   rectangle   object,   square   object   or   circle   object.   Finally   print   the   areas   of   theobjects present in the Shape array
        Shape s[] = new Shape[10];

    }
}
