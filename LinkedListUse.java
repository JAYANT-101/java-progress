import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListUse {
    public static void main(String[] args) {
        LinkedList<Integer> l1=new LinkedList<>();
        LinkedList<Integer> l2=new LinkedList<>();
        l2.add(11);
        l2.add(15);
        l2.add(13);
        l2.add(12);
        l1.add(6);
        l1.add(4);
        l1.add(6);
        l1.add(7);
        l1.add(3);
        l1.add(5);
        l1.addLast(565);
        l1.addFirst(456);
        l1.addAll(l2);//will star adding elements in the end
//        l1.addAll(1,l2);will add given given index
//        l1.clear(); will do as it says
        l1.add(1 ,9);//this will add element at given index and push the existing value at that index
        l1.add(0 ,9);
        l1.set(5,222);//It will remove the element at given index and replace it with given value
        System.out.println(l1.contains(10));
        System.out.println(l1.indexOf(6));
        System.out.println(l1.lastIndexOf(6));
        for(int i=0;i<l1.size();i++){
            System.out.print(l1.get(i));//to get index element
            System.out.print(",");
        }
    }
}
