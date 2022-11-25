package new_version.Q101ToQ120.q116;

class A{
    public void test(){
        System.out.print("A");
    }
}

class B extends A{
    public void test(){
        System.out.print("B");
    }
}

public class C extends A{
    public void test(){
        System.out.print("C");
    }

    public static void main(String[] args) {
        A b1=new A();
        A b2=new C();
        b1=(A)b2;          //line n1
        //A b3=(B)b2;        //line n2
        b1.test();
       // b3.test();
    }
}
/*What is the result?
A. AB
B. AC
C. CC
D. A ClassCastException is thrown only at line n1.
E. A ClassCastException is thrown only at line n2.
Answer: E

 */