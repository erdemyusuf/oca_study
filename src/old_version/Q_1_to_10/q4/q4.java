package old_version.Q_1_to_10.q4;

public class q4 {
    public static void main(String[] args) {
        int iVar=100;
        float fVar=100.100f;
        double dVar=123;
        double dVar2=123.100;
        long lVar=2147483648L;//if the value is greater than max int value we have to put L at the end.
        fVar=iVar;
        //iVar=fVar; cannot
        //fVar=dVar; cannot
        dVar=fVar;
        //iVar=dVar; cannot
        dVar=iVar;
        //byte -> short -> char -> int -> long -> float -> double
        /*
        we can cast implicitly
        byte to==> short, int,long,float,double
        short to==> int,long,float,double
        char to==>int,long,float,double
        int to==>long,float,double
        long to==>float,double
        float to==>double
         */

        byte b=12;
        short s=234;
        char c='A';
        int i=12;
        long l=234;
        float f=12.23f;
        double d=123.23;
        //b-------------------
        s=b;
        i=b;
        l=b;
        f=b;
        d=b;
        //c=b; false
        //s--------------------
        i=s;
        l=s;
        f=s;
        d=s;
        //c=s;
        //b=s;
        //c------------
        i=c;
        d=c;
        f=c;
        l=c;
        //s=c;
        //b=c;
        //i-----------------
        f=i;
        d=i;
        l=i;
        //b=i;
        //c=i;
        //s=i;
        //l--------------
        f=l;
        d=l;
        //i=l;
        //c=l;
        //s=l;
        //b=l;
        //f_--------
        //i=l;
        //c=l;
        //s=l;
        //b=l;
        //l=f;
        d=f;


        //c=b;
        //after method if you write sout it put all things inside sout
//        String str="Java";
//        System.out.println(str.toLowerCase());


    }
}
