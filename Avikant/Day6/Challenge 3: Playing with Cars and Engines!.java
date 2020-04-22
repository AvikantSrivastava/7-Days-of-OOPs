class Car {
  
    // Complete its implementation
    private int id ;
    private String model ;
    private String color ;


    void carFeatures(){
        System.out.println("Model: " + model);
        System.out.println("Color: " + color);

    }

    void setModel(String model){
        this.model = model;
 
    }

    void setColor(String color){
        this.color = color;

    }
    
  }
  
  class Toyota extends Car {
    
    // Complete its implementation

    void setStart(){
        ToyotaEngine engine = new ToyotaEngine();

        engine.start();

    }
    
  }
  
  class ToyotaEngine {

    
    // Complete its implementation
    void start(){
        System.out.println("Start whoom whoom......");
    }

    void stop(){
        System.out.println("Stop..dissh......");
    }
    
  }
  
  class Main {
  
    public static void main(String[] args) {
      // Write your code here
      Toyota t = new Toyota();
    t.setModel("Fortuner");
    t.setColor("Silver");

    t.carFeatures();
    t.setStart(); 
    }
    
  }