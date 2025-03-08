import java.util.ArrayList;
import java.util.HashSet;

public class problem15 {
    public static void main(String[] args) {
        ArrayList<String> t=new ArrayList<>();
        t.add("titu");
        t.add("tipu");
        t.add("gandu");
        t.add("gndu");
        t.add("landu");
        t.add("chodu");
        t.add("kala");
        t.add("gora");
        t.add("mc");
        t.add("bc");
        for(String e:t){
            System.out.println(e);
        }
        HashSet<Integer> p =new HashSet<>();
        p.add(2);
//        p.add(2);
        p.add(9);
        p.add(7);
        p.add(1);
        p.add(5);
        p.add(3);
        for(int r:p){
            System.out.println(r);
        }
    }
}
