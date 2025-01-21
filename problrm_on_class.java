class employee{
int salary;
String name;
public int getSalary(){
    return salary;
}
public void setName(String newName){
name=newName;

}
public String getName(){
    return name;
    }
}
public class problrm_on_class {
    public static void main(String[] args) {
        employee mc=new employee();
        mc.setName("mather chod");
        mc.salary=12;
        System.out.println(mc.getName());
        System.out.println(mc.getSalary());
    }
}
