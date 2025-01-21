class base{
    int x;
    public int getX() {
        return x;
    }
    public void setX(int x) {
        System.out.println("i am in base and setting x");
        this.x = x;
    }
    public void printMe(){
        System.out.println("i am not a constructor");
    }
}
class derived extends base{
    int y;
    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }
}
public class inheretance {
    public static void main(String[] args) {
        derived bc= new derived();
        bc.setX(4);
        bc.setY(3);
        System.out.println(bc.getY());
        System.out.println(bc.getX());
    }
}
