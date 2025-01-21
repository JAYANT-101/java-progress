public class CWH_array_use {
    public static void main(String[] args) {
        int [] marks = {34,34,5,4,5};
        //String [] name = {"Jayant","sinha"};
        //System.out.println(marks.length);
        for(int i= marks.length -1;i>=0;i--) {
            System.out.println(marks[i]);
        }
        System.out.println("for each loop");
        for(int element: marks){
            System.out.println(element);
        }
    }
}
