class Rectangle {
    private int length;
    private int width;
    // Default Constructor
    public Rectangle(){
        this.length = 0;
        this.width = 0;
    }
    // Parameterized Constructor
    public Rectangle(int length, int width)
    {
        this.length = length;
        this.width = width;
    }
    public int getArea()
    {
        int area = 0;
        area = this.length * this.width;
        return area;
    }
}
class Main1 {
    public static void main(String args[])
    {
        Rectangle obj = new Rectangle(2 ,2);
        System.out.println("The area of rectangle is " + obj.getArea());
    }

}
