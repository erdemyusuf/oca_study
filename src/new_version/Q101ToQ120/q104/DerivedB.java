package new_version.Q101ToQ120.q104;

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
        Base b4=b3;
        b1=(Base)b2;
        b1.test();
        b4.test();
    }
}
/*
	 *What is the result?
A. BaseDerivedA
B. BaseDerivedB
C. DerivedBDerivedB
D. DerivedBDerivedA
E. A ClassCastException is thrown at runtime.

Answer:
	 */


////Answer: DerivedADerivedB