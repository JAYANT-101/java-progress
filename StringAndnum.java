import java.util.*;

class TheMagic{
    List<Character> Letter=new ArrayList<>();
    List<Character> Number=new ArrayList<>();
    public void Spread(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string of random 123adad");
        String a =sc.nextLine();
        for(int i=0;a.length()>i;i++){
            if(Character.isLetter(a.charAt(i))){
                Letter.add(a.charAt(i));
            }else {
             Number.add(a.charAt(i));
            }
        }
        Collections.sort(Number);
        Collections.sort(Letter);
        StringBuilder result=new StringBuilder();
        if(Letter.size()+1==Number.size()||Letter.size()==Number.size()){
            int i =0,j=0;
            result.append(Number.get(i));
            i++;
            while(Letter.size()>j&&Number.size()>i){
                result.append(Letter.get(j++));
                result.append(Number.get(i++));
            }
        }else {
            System.out.println("This sequence will not work");
        }
        System.out.println(result);
    }
}
public class StringAndnum {
    public static void main(String[] args) {
        TheMagic b=new TheMagic();
        b.Spread();
    }
}
