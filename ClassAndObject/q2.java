//Create a class Currency with member variable Rs and Paisa(int). Create two object of currency and store their sum in another currency object. The addition of currency should be done is such a way thatif paisa&gt;99 rupees should be incremented by 1 and paisa should be decremented by 100

package Java.LabQuestions.ClassAndObject;

class Currency{
    int Rs,Paisa;
    Currency(int r, int p){
        this.Paisa = p;
        this.Rs = r;
    }
    void sum(Currency a, Currency b){
        int RsA = a.Rs + b.Rs;
        int paisaA = a.Paisa + b.Paisa;
        if(paisaA >= 100){
            paisaA = paisaA - 100;
            RsA++;
        }
        System.out.println("The sum is Rs "+ RsA + " and "+ paisaA + " Paisa");
    }

}

public class q2 {
    public static void main(String[] args){
        Currency c1 = new Currency(1, 99);
        Currency c2 = new Currency(1, 99);
        Currency c3 = new Currency(0, 0);
        c3.sum(c1, c2);
    }
}
