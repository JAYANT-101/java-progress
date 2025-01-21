class me{
    private int id;
    private String name;
    public me(){
        id=0;
        name="enter name";
    }
    public me(int i,String m){
        id=i;
        name=m;
    }
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
}
public class Constructors {
    public static void main(String[] args) {
        me jayant=new me(12,"god of war");
        System.out.println(jayant.getName());
        System.out.println(jayant.getId());
    }
}