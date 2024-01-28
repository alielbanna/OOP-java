// public class Car {


//     //default constructor be like this  -- empty constructor 
//     public Car(){

//     }

//     // constructor take a parameter
//     public Car(int speed){

//         this.speed = speed;
//     }


//     //Attributes
//    public int speed;
//     private String color;
//     protected String model;

//     //setter
//     public void setColor(String color){
//         this.color = color;
//     }

//     //getter
//     public String getColor(){
//         return color;
//     }


//     //methods / functions 
//     void turnOn(){
//         System.out.println("Turn on now");
//     }

//     void brake(){
//         System.out.println("Brake");
//     }

//      void turnOff(){
//         System.out.println("Turn off now");
//     }
// }


public class Car {

    private String model; 
    private String color;
    private int doors;
    //car HAS-A engine
    private Engine engine;

    
    
    public Car() {
    }

    public Car(String model, String color, int doors) {
        this.model = model;
        this.color = color;
        this.doors = doors;
    }
    
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public int getDoors() {
        return doors;
    }
    public void setDoors(int doors) {
        this.doors = doors;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    

}