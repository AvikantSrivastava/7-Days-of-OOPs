// Abstarct Book Class
abstract class Book {

    // Protected Fields
    protected String name;
    protected String author;
    protected String price;
  
    // Parameterized Constructor
    public Book(String name, String author, String price) {
      this.name = name;
      this.author = author;
      this.price = price;
    }
  
    // Abstract Method
    public abstract String getDetails();
  
  }
  
  // Class MyBook extending Book Class
  class MyBook extends Book {
  
    // Parameterized Constructor
    public MyBook(String name, String author, String price) {
      super(name, author, price); 
    }
  
    // Overrideing the getDetails Abstrat Method of the Base Class
    @Override
    public String getDetails() {
      // Write your code here
      return (name + ", " + author + ", " + price);
    }
  
  }