package new_version.Q101ToQ120.q119;

public class App2 {
    String greet="Welcome";
    public App2(){
     this.greet="Hello!";
    }
    public void setGreet(){
        String greet="Good Day!";
    }

    public static void main(String[] args) {
        App2 t=new App2();
        String greet="Good Luck!";
        System.out.println(t.greet);
    }
}
/*What is the result?
A. Good Luck!
B. Good Day!
C. Welcome!
D. Hello!
answer D
 */