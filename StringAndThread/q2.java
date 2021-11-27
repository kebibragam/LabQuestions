//Define an array of size 10 and store 10 countries’ name in it. Then list the names of countries thatstarts and ends with letter ‘a’.

package Java.LabQuestions.StringAndThread;

public class q2 {
    public static void main(String[] args){
        String[] country={"argentina","nepal", "australia", "china", "afghanistan", "algeria", "america","armenia", "bhutan", "germany"};
        for(int i=0; i< country.length; i++){
            if(country[i].startsWith("a") && country[i].endsWith("a")){
                System.out.println(country[i]);
            }
        }
    }
    
}
