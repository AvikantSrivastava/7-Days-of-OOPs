abstract class Book {
    protected String name;
    protected String author;
    protected String price;

    public Book(String name, String author, String price){
        this.name = name;
        this.author = author;
        this.price = price;
    }
    public abstract String getDetails();
}
class MyBook extends Book{
    public MyBook(String name, String author, String price){
        super(name, author, price);
    }
    public String getDetails(){
        return name + " ," + author + " ," + price;
    }
    public static void main(String args[]){
        MyBook read = new MyBook("Shoe Dog", "Phil Knight", "499");
        System.out.println(read.getDetails());
    }
        }
