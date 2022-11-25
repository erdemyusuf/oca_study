package old_version.Q_1_to_10.q10;

public class q10 {
    public static void main(String[] args) {
        CheckingAccount acct=new CheckingAccount((int)(Math.random()*1000));
        //line n1
        //acct.setAmount(-acct.getAmount()); //is false
        //acct.amount = 0;  // is true
        //acct.setAmount(0);   //is true
        //acct.getAmount() = 0; //is false you cannot assign it  to value
        //this.amount=0;   //is false you can only uset this inside constructor
        //acct.changeAmount(0); //is false
        //acct.changeAmount(-acct.amount);//is true

        System.out.println(acct.getAmount());
    }
}

/*
Which three lines, when inserted independently at line n1, cause the program to print a 0 balance?
A.	acct.setAmount(-acct.getAmount());
B.	acct.amount = 0; <option D earlier>
C.	acct.setAmount(0);
D.	acct.getAmount() = 0; <option E earlier>
E.	this.amount = 0; <option A earlier>
F.	acct.changeAmount(0); <option F earlier>
G.	acct.changeAmount(-acct.amount); <option G earlier>

 */
