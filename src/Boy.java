//child
public class Boy extends Person {

    //the default const. be like 

    public Boy(){
        //super() => return to the the default parent const. and not necessary to be writen
        super();
    }

    // override annotation for hint not necessary to be writen use for overriding
    @Override
    public void run(){
        // to use the original goal of the parent class function 
        super.run();
        System.out.println("Alone");
    }
    
}
