package new_version.Q161ToQ180.q163;

public class Test163 {
    public static void main(String[] args) {
        int x=1;
        int y=0;
        if(x++>++y){
            System.out.print("Hello ");
        }else{
            System.out.print("Welcome ");
        }
        System.out.print("Log"+x+":"+y);
    }
}
/*
Answer:
Welcome Log2:1
 */
