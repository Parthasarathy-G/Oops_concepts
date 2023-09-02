
//SINGLE INHERITANCE

/*
class Car{
    void price(){
        System.out.println("Price is : 1000");
    }
}
class service extends Car{
    void run(){
        System.out.println("2 years");
    }
}
class Main {
    public static void main(String[] args) {
        service c = new service();
        c.price();
        c.run();
    }
}
*/

//MULTILEVEL INHERITANCE

import org.w3c.dom.ls.LSOutput;

/*
class Computer{
    void pc(){
    System.out.println("Ryzen 5 4600h hexa core processor");
    }
}
class ram extends Computer{
    void specs(){
    System.out.println("8gb ram");
    }
}
class graphicsCard extends ram{
    void price(){
    System.out.println("Rs.12000");
    }
}
class Main{
    public static void main(String[] args) {
        graphicsCard p = new graphicsCard();
        p.pc();
        p.specs();
        p.price();
    }
}
*/

//HIERARCHICAL INHERITANCE

/*
class Computer{
    void pc(){
    System.out.println("Ryzen 5 4600h hexa core processor");
    }
}
class ram extends Computer{
    void specs(){
    System.out.println("8gb ram");
    }
}
class graphicsCard extends Computer{
    void price(){
    System.out.println("Rs.12000");
    }
}
class Main{
    public static void main(String[] args) {
        graphicsCard p = new graphicsCard();
        p.pc();
//        p.specs();
        p.price();
    }
}
*/
