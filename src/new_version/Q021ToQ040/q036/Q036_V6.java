package new_version.Q021ToQ040.q036;

public class Q036_V6 {
    public static void main(String[] args) {
        String[] arr={"A","B","C","D"};
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ " ");
            if(arr[i].equals("C")){
                break;
            }
            System.out.println("Work Done");
            break;
        }
    }
}


/*
Answer is :A Work Done
 */
