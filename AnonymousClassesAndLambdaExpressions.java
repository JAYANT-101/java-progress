interface DemoAno{
    void meth1();
    void meth2();
}
interface DemoAno2{
    void method1(int c);
}
//class AnonyDEmo implements DemoAno{   normal war to implement this but id small data is there use Anonymous Classes
//    public void Display(){
//        System.out.println("Hello");
//    }
//    @Override
//    public void meth1() {
//        System.out.println("I am meth 1");
//    }
//    @Override
//    public void meth2() {
//        System.out.println("I am meth 2");
//
//    }
//}
public class AnonymousClassesAndLambdaExpressions {
    public static void main(String[] args) {
//        AnonyDEmo a= new AnonyDEmo();
//        a.meth1();
//        DemoAno b=new AnonyDEmo():
//        b.meth1();
        DemoAno a=new DemoAno() {
            @Override
            public void meth1() {
                System.out.println("I am meth 1");
            }
            @Override
            public void meth2() {
                System.out.println("I am meth 2");
            }
        };
        a.meth1();
        a.meth2();
        DemoAno2 b=(c)->{ //This is a lambda function and this is used to implement interfaces with single method without making a class
            System.out.println("This the method1"+c);
        };
        b.method1(4);
    }
}
