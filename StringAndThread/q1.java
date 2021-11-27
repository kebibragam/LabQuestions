//Write a program to create string array of size ‘n’ and prompt the user to enter 10 names in it. Thenyou are required to replace all ‘i’ with ‘!’ and display the result.

package Java.LabQuestions.StringAndThread;

import java.util.Scanner;

public class q1 {
    public static void main(String[] args){
        String[] name = new String[10];
        System.out.println("Enter 10 names: ");
        Scanner scan = new Scanner(System.in);
        for(int i =0; i< name.length; i++){
            name[i] = scan.next();            
            name[i]=name[i].replace('i', '!');
        }
        for(int i=0; i< name.length; i++){
            System.out.println(name[i]);
        }
        scan.close();
    }
    
}
