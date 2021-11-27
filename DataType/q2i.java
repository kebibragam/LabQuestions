//WAP to print pattern

package Java.LabQuestions.DataType;

public class q2i {
    public static void main(String[] args) {
        // int sum = 0;
        // for(int i =1 ; i<=5; i++){
        //     sum= sum*10 + i;
        //     System.out.println(sum);
        // }
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.print("\n");
        }
    }
}
