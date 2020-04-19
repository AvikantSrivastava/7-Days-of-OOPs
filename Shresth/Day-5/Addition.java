interface Addition {
    int add(int num1, int num2);
}
class add implements Addition{
    public int add(int num1, int num2){
        return num1 + num2;
    }
    public static void main(String args[]){
        add sum = new add();
        System.out.println(sum.add(24, 36));
    }
}
