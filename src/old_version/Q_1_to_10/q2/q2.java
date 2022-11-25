package old_version.Q_1_to_10.q2;

public class q2 {

    private q2(){
        System.out.println("private constructor");
    }
    private q2(String str){
        System.out.println(str);
    }
    /*
    2. Which three statements are true about the structure of a Java class? (Choose three.)
A. A class cannot have the same name as its field.
B.	A public class must have a main method.
C.	A class can have final static methods.
D.	A class can have overloaded private constructors.
E.	Fields need to be initialized before use.
F.	Methods and fields are optional components of a class.

correct answer is C,D and F

     */
    static String name;
    boolean answer;
    int q2=12;//A class cannot have the same name as its field is wrong

    public static void main(String[] args) {
        //	A public class must have a main method is false, because it can be but not must.
        System.out.println(add(23,23,45));
        q2 q2=new q2();
        q2 q3=new q2("Osman");
        //Fields need to be initialized before use is false
        System.out.println(q2.answer);
        System.out.println(name);
    }
//A class can have final static methods is true
    public static final int add(int... a){
        int sum=0;
        for(int w:a){
            sum+=w;
        }
        return sum;
    }
}
