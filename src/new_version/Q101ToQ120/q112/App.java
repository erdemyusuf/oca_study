package new_version.Q101ToQ120.q112;

public class App {
   // int count; it must be static
   static int count;
    public static void displayMsg(){
        count++;                    //line n1
        System.out.println("Welcome"+"Visit Count:"+count );//line n2
    }

    public static void main(String[] args) {
        App.displayMsg();                     //line n3
        App.displayMsg();                     //line n4
    }
}
/*What is the result?
A. Compilation fails at line n3 and line n4.
 B. Compilation fails at line n1 and line n2.
 C. Welcome Visit Count:1Welcome Visit Count: 1
  D. Welcome Visit Count:1Welcome Visit Count: 2
  Answer:B

 */