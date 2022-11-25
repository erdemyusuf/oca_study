package old_version.Q_1_to_10.q7;

public class Tool implements Exportable{
    //protected void export(){  //line n1 we cannot use protected because overwritten method is public
    public void export(){
        System.out.println("Tool::export");
    }
}
