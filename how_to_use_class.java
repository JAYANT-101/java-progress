class man{
    int age;
     String name;
    public void printdetail(){
        System.out.println("My name is "+ name);
        System.out.println("My age is "+age);
    }
}
public class how_to_use_class {
    public static void main(String[] args) {
        man mc=new man();
        mc.age=22;
        mc.name="mathderchod";
        mc.printdetail();
    }
}
