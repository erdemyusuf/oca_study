package new_version.Q061ToQ080.q067;

class Caller{
    private void init(){
        System.out.println("Initialized");
    }

    private void start(){
        init();
        System.out.println("Started");
    }
}

public class TestCaller {
    Caller c=new Caller();
   // c.start();
   // c.init();
}
//What is the result?
//A. An exception is thrown at runtime.
//B. InitializedStartedInitialized
//C. InitializedStarted
//D. Compilation fails.
//Answer: D