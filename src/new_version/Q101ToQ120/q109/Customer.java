package new_version.Q101ToQ120.q109;

public class Customer {
    ElectricAccount acct=new ElectricAccount();

    public void useElectricity(double kWh){
        acct.addkWh(kWh);
    }

}
