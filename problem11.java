abstract class voice{
    abstract void fereqeuncy();
    abstract void amplitude();
}
class human extends voice{
    public void fereqeuncy(){
        System.out.println("pitch");
    }
    public void amplitude(){
        System.out.println("loud");
    }
}
public class problem11 {
    public static void main(String[] args) {
human hm=new human();
hm.fereqeuncy();
hm.amplitude();
    }
}