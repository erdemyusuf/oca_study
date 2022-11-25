package old_version.Q_1_to_10.q9;

public class A extends B{

    public A(){
        System.out.print("A");
    }

    public static void main(String[] args) {
        A a=new A();
        //Answer :CAB
        System.out.println();
        C c=new A();
        //CAB
        System.out.println();
        B b=new A();
        //CAB
    }
}
