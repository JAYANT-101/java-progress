interface sample {
    void meth1();
    void meth2();
}
interface childSample extends sample{
    void meth3();
    void meth4();
}
class MySampleclass implements childSample{
    public void meth3(){
        System.out.println("meth 3");
    }
    public void meth4(){
        System.out.println("math 4");
    }
    public void meth1(){
        System.out.println("meth 1");
    }
    public void meth2(){
        System.out.println("meth2");
    }

}
public class Inheritance_in_Interfaces {
    public static void main(String[] args) {
        MySampleclass obj=new MySampleclass();
        obj.meth1();
        obj.meth2();
        obj.meth3();
        obj.meth4();
    }
}
