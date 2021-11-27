//WAP to create an array to hold 10 numbers and print all the numbers in ascednding order

package Java.LabQuestions.DataType;



public class q10 {
    public static void main(String[] args) {
        int[] arr = {1,2,0,9,6,7,8,5,4,3};
        int gtr =arr[0];
        int temp;
        for (int i=0; i< arr.length;i++) {
            if(arr[i]> gtr){
                temp=gtr;
                gtr=arr[i];
                arr[i]= temp;
            }
        }
        for (int i : arr) {
            System.out.println(arr[i]);
        }
    }
}
