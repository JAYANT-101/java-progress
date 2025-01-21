import java.util.Scanner;
class em{
    private int id;
    private String name;

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
public class Access_modifiers {
    public static void main(String[] args) {
        em jayant=new em();
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        String n=sc.nextLine();
        jayant.setId(a);
        jayant.setName(n);
        System.out.println(jayant.getName());
        System.out.println(jayant.getId());
    }
}
