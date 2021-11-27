//Write a program to print the last 10 digit phone no from given array(remove country code and othersymbols):String phonelist[]={“9841555555”,”97719849333333”,”+977-9818777777”,”+9771- 9803000000”}.

package Java.LabQuestions.StringAndThread;

public class q4 {
    public static void main(String[] args){
        String[] phonelist={"9841555555","97719849333333","+977-9818777777","+9771- 9803000000"};
        for(int i =0; i< phonelist.length; i++){
            phonelist[i] = phonelist[i].substring(phonelist[i].length()-10);
        }
        for (String string : phonelist) {
            System.out.println(string);
        }
    }
}
