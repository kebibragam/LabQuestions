//Create a base class complex with member variables real and imaginary with constructor to initialize values of real and imaginary. Also include the member method called display to display the values of complex number. Then create a child class complex1 with member variables real and imaginary and member method add which adds it’s real with parents real and it’s imaginary with parents imaginaryand return the result as a complex type. Also include constructor that initializes it’s member variablevalues.Create an object of complex1 and call the add method on behalf of it to print the result.

package Java.LabQuestions.Inheritance;

class complex{
    // int real= 5;
    // int imaginary= 6;
    complex(int real, int imaginary){
        this.real = real;
        this.imaginary = imaginary;
    }
    void display(){
        System.out.println("Real: " +real+ " Imaginary: " + imaginary );
    }
}

class complex1 extends complex{
    int real1, imaginary1;
    complex1(int real1, int imaginary1) {
        super(real1, imaginary1);
    }
    void add(complex c,complex1 c1){
        int sumReal= c.real + c1.real;
        int sumImaginary = c.imaginary + c1.imaginary;
        System.out.println("Sum is ("+ sumReal + ","+ sumImaginary+ ")"); 
    }

}

public class q1 {
    public static void main(String[] args){
        complex1 obj = new complex1(2,3);
        complex obj1 = new complex(3,2);
        obj.add(obj1, obj);
    }
}
