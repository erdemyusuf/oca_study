package old_version.Q_1_to_10.q1;

public class q1 {

    public static void main(String[] args) {
        //1st version
        Boolean[] bool=new Boolean[2];
        bool[0]=new Boolean(Boolean.parseBoolean("True"));
        bool[1]=new Boolean(null);
        System.out.println(bool[0]+" "+bool[1]);
        //2nd version
        Boolean[] bool2=new Boolean[2];
        bool2[0]=new Boolean(Boolean.parseBoolean("Osman Sayli"));
        bool2[1]=new Boolean(null);
        System.out.println(bool2[0]+" "+bool2[1]);
        //3rd version
        Boolean[] bool3=new Boolean[2];
        bool3[0]=new Boolean(Boolean.parseBoolean(null));
        bool3[1]=new Boolean("true");
        System.out.println(bool3[0]+" "+bool3[1]);

    }
}
