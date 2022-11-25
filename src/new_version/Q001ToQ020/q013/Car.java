package new_version.Q001ToQ020.q013;

class Vehicle{
    int x;
    Vehicle(){
        this(10);//line n1
    }
    Vehicle(int x){
        this.x=x;
    }
}


public class Car extends Vehicle {
    int y;
    Car(){
        super(10);
    }
    Car(int y){
        super(y); //line n2
        this.y=y;
    }
    public String toString(){
        return super.x+":"+this.y;
    }

    public static void main(String[] args) {
        Vehicle y=new Car(20);
        System.out.println(y);
    }
}
