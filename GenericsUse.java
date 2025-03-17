import java.util.ArrayList;
class MyGeneric<T1,T2>{
    int val;
    private T1 t1;
    private T2 t2;

    public MyGeneric(T1 t1,T2 t2, int val) {
        this.t1 = t1;
        this.val = val;
        this.t2=t2;
    }

    public T2 getT2() {
        return t2;
    }

    public void setT2(T2 t2) {
        this.t2 = t2;
    }

    public T1 getT1() {
        return t1;
    }

    public void setT1(T1 t1) {
        this.t1 = t1;
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }
}
public class GenericsUse {
    public static void main(String[] args) {
//        ArrayList arrayList =new ArrayList(); only take 1 type of data type
//        arrayList.add("str1");
//        arrayList.add(54);
//        arrayList.add(643);
        MyGeneric<String,Integer> g1=new MyGeneric<>("jayant",2,23);
        String a=g1.getT1();
        int b=g1.getVal();
        int c=g1.getT2();
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
