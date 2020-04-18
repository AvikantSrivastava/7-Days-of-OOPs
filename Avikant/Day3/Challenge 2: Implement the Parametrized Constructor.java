// Derived Class
class Dell extends Laptop { 

    public Dell() { // Default Constructor
      super();
    }
  
    public Dell(String name) { // Parametrized Constructor
      super(name);
      // Write your code here 
  
    }
  
    public String getDetails() { 
      return getName();
    }
  
  }