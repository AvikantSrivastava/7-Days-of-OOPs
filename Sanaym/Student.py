class Student {

  // Define private fields here
   private String Name;
   private double Marks1;
   private double Marks2;
  public Student() {
    // Write definition here
    this.Name="";
    this.Marks1=0;
    this.Marks2=0;

  }

  public Student(String name, double mark1, double mark2) { 
    // Write definition here
    this.Name= name;
    this.Marks1 = mark1;
    this.Marks2 = mark2;

  }

  public double getMarks(int markNumber) {
    // Write definition here
    if(markNumber ==1)
    return(this.Marks1);
    else
    return(this.Marks2);
  }

  public double calcTotal() {
    // Write definition here
    double totalMarks = 0;
    totalMarks= getMarks(1)+getMarks(2);
    return totalMarks;
  }
  
}

class Demo {

  public static void main(String args[]) {
    Student student = new Student("Jack", 60, 70);
    System.out.println(student.calcTotal());
  }

}