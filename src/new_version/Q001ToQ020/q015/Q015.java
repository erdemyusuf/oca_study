package new_version.Q001ToQ020.q015;

public class Q015 {
    public static void main(String[] args) {
        StringBuilder sb1=new StringBuilder("Duke");
        String str1=sb1.toString();
        //insert code here
       String str2=str1;// the objects are equalized
        //String str2 = new String(str1);
        //String str2 = sb1.toString();
        //String str2 = "Duke";

        System.out.println(str1==str2); //== checks if the objects are equal, not their values
    }
}
// Which code fragment, when inserted at line 8, enables the code to print true?
//A.	String str2 = str1;
//B.	String str2 = new String(str1);
//C.	String str2 = sb1.toString();
//D.	String str2 = "Duke";