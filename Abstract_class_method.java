abstract class prent{
    public prent(){
        System.out.println("i am b2");
    }
    public void sayHello(){
        System.out.println("hello");
    }
    abstract public void greet();
    abstract public void greet2();
}
class child extends prent{
    @Override
    public void greet(){
        System.out.println("good morning");
    }

    @Override
    public void greet2() {
        System.out.println("good afternoon");
    }
}
abstract class child2 extends prent{
    public void th(){
        System.out.println("I am good");
    }
}
public class Abstract_class_method {
    public static void main(String[] args) {
        child obj=new child();
    }
}
