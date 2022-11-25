package new_version.Q101ToQ120.q110;

class Base{
    public void test(){
        System.out.print("Base ");
    }
}
class DerivedA extends Base{
    public void test() {
        System.out.print("DeriverA ");
    }
}


class DerivedB extends DerivedA{
    public void test() {
        System.out.print("DeriverB ");
    }

    public static void main(String[] args) {
        Base b1=new DerivedB();
        Base b2=new DerivedA();
        Base b3=new DerivedB();
        b1=(Base)b3;
        Base b4=(DerivedA)b3;
        b1.test();
        b4.test();
    }
}
/*What is the result?

A. BaseDerivedA
B. BaseDerivedB
C. DerivedBDerivedB
D. DerivedBDerivedA
E. A ClassCastException is thrown at runtime.

Answer: C

 */