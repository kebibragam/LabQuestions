//WAP to check whether the number is palindrome or not


package Java.LabQuestions.DataType;

import java.util.Scanner;

public class q6 {
    public static void main(String[] args) {
        System.out.println("Enter a number: ");
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        scan.close();
        int num1 = num;
        int sum=0,rem;
        while(num1>0){
            rem= num1%10;
            sum= sum*10+rem;
            num1= num1/10;
        }
        if(num==sum){
            System.out.println(num +" is palindrome number.");
        } else{
            System.out.println(num +" is not palindrome number");
        }
    }
}
