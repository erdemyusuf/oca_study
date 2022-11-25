package old_version.Q_1_to_10.q5;

public class Car extends Vehicle{
    String trans;

    Car(String trans){     //line 1
        this.trans=trans;
    }

    Car(String type,int maxSpeed,String trans){
        super(type,maxSpeed); //line n2
        this.trans=trans;
        //this(trans); bu şekilde olursa bu line da hata verir
        //2 constructor aynı anda cağırılamaz
        //this(), and super() must be i,n first line
    }
}
