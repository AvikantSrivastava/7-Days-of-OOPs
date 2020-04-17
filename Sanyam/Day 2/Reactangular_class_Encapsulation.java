// Rectangle Class
class Rectangle {
  private int length;
  private int width;
  private int area;
  
  
  public Rectangle() {
   
    this.length=0;
    this.width=0;
    this.area=0;
  }
  
  public Rectangle(int length, int width) {
    
    this.length=length;
    this.width=width;
  }

  public int getArea() {

    this.area=this.length*this.width;
    return(this.area);
  }
  
}
class Demo {

  public static void main(String args[]) {

    Rectangle obj = new Rectangle(2, 2);
    System.out.println(obj.getArea());

  }

}