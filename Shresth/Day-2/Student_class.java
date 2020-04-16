class Student_class {
    private String name;
    private String rollNumber;
    public Student_class(){
        name = "Nada";
        rollNumber = "N/A";
    }
    public void setName(String x){
        this.name = x;
    }
    public String getName(){
        return name;
    }
    public void setRollNumber(String x){
        this.rollNumber = x;
    }
    public String getRollNumber(){
        return rollNumber;
    }
}
class Main2{
    public static void main(String args[]){
        Student_class obj = new Student_class();
        obj.setName("Chacha");
        System.out.println(obj.getName());

        obj.setRollNumber("66");
        System.out.println(obj.getRollNumber());
    }

}
