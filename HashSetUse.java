import java.util.HashSet;

public class HashSetUse {
    public static void main(String[] args) {
        HashSet<Integer> lebole=new HashSet<>();//initial capacity of 16 and hash factor of 0.75
//        HashSet<Integer> lebole=new HashSet<>(7,0.56f);
        lebole.add(33);
        lebole.add(38);
        lebole.add(35);
        lebole.add(33);
        lebole.add(36);
        lebole.add(32);
        lebole.add(55);
        lebole.add(23);
        lebole.add(343);
        lebole.add(34);
        System.out.println(lebole);
    }
}
