package old_version.Q_1_to_10.q5;

public class q5 {
    public static void main(String[] args) {
        Car c1=new Car("Auto");
        Car c2=new Car("4W",150,"Manual");
        System.out.println(c1.type+" "+c1.maxSpeed+" "+c1.trans);
        System.out.println(c2.type+" "+c2.maxSpeed+" "+c2.trans);
        /*
        What is the output?
        Answer:
        4W 100 Auto
        4W 150 Manual
         */
    }
}
