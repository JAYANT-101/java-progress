//class circle{
//    public int radius;
//    circle (int r){
//        System.out.println("I am circle");
//        this.radius=r;
//    }
//    public double area(){
//        return Math.PI*this.radius*this.radius;
//    }
//}
//class cylinder1 extends circle{
//
//    public int height;
//    cylinder1 (int r, int h){
//        System.out.println("I am cylinder");
//        super(r);
//        this.height=h;
//    }
//    public double volume(){
//        return Math.PI*this.radius*this.radius*this.height;
//    }
//}
//public class problem10 {
//    public static void main(String[] args) {
//        circle obj=new circle(4);
//        cylinder1 obj2=new cylinder1(3,5);
//        System.out.println(obj.area());
//        System.out.println(obj2.volume());
//
//    }
//}
//problem 2
class rectangle{
    public int length;
    public int breath;
    rectangle (int l,int b){
        this.length=l;
        this.breath=b;
    }
    public int area(){
        return this.length*this.breath;
    }
}
class cuboid extends rectangle{
    public int height;
    cuboid(int l,int b,int h){
        super(l,b);
        this.height=h;
    }
    @Override
    public int area(){
        return (2*this.length*this.breath)+(2*this.breath*this.height)+(2*this.breath*this.height);
    }
}
public class problem10 {
    public static void main(String[] args) {
        rectangle obj=new rectangle(4,6);
        cuboid obj2=new cuboid(5,7,9);
        System.out.println(obj.area());
        System.out.println(obj2.area());
    }
}