//WAP to check whether the number is prime or not

package Java.LabQuestions.DataType;

import java.util.Scanner;

public class q4 {
    public static void main(String[] args) {
        boolean flag = false;
        System.out.println("Enter a number: ");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        scan.close();
        for(int i=2; i<num; i++){
            if(num%i == 0){
                flag= true;
                break;
            }
        }
        if(flag==true){
            System.out.println(num + " is not a prime number.");
        } else {
            System.out.println(num + " is prime number.");
        }
    }
}
