package Oops_concepts.Encapsulation;

class encapsulation {
    private String name;
    private int age;
void getName(String name){
    this.name = name;
}
void setAge(int age){
this.age = age;
}
public String showName(){
    return name;
}
public int showAge(){
    return age;
}
}
public class checkEncapsulation{
    public static void main(String[] args) {
        encapsulation p = new encapsulation();
        p.getName("Parthasarathy");
        p.setAge(10);
        System.out.println(p.showName());
        System.out.println(p.showAge());
    }
}