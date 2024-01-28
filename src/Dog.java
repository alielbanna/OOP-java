public class Dog extends Pets implements Animal{

    @Override
    public void drink() {
       System.out.println("Dog is drinking");
    }

    @Override
    public void walk() {
        System.out.println("Dog is walking");

    }

    @Override
    void shout() {
        
    }
    
}
