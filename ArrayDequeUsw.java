import java.util.ArrayDeque;

public class ArrayDequeUsw {
    public static void main(String[] args) {
        ArrayDeque<Integer> a1=new ArrayDeque<>();//default size is of 16
        a1.add(55);
        a1.add(52);
        a1.add(53);
        a1.addFirst(5);
        System.out.println(a1.getFirst());
        System.out.println(a1.getLast());
    }
}
