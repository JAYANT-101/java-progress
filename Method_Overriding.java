class A{
    public int jayant(){
        return 4;
    }
    public void meth2(){
        System.out.println("i am method 2 of class a");
    }
}
class B extends A{
    @Override
    public void meth2(){
        System.out.println("i am method 2 of class b");
    }
    public void meth3(){
        System.out.println("i am method 3 of class b");
    }
}
public class Method_Overriding {
    public static void main(String[] args) {
        A a=new A();
        a.meth2();
        B b=new B();
        b.meth2();
    }
}
