package old_version.Q_1_to_10.q6;

import java.io.IOException;

public class Test {
    public static void main(String[] args){
        try{
            X xobj=new X();
            xobj.printFileContent();
            System.out.println("test try");
        } catch(IOException e){
            System.out.println("test IO catch");
        }
        catch(Exception e){
            System.out.println("test catch");
        }

    }

    }
