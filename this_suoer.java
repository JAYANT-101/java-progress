class ekclass{
    int a;

    public int getA() {
        return a;
    }

    ekclass(int v){
        this.a=v;

    }
    public int r1(){
        return 1;
    }
}
public class this_suoer {
    public static void main(String[] args) {
        ekclass e=new ekclass(3);
        System.out.println(e.getA());
    }
}
