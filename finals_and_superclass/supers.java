package Oops_concepts.finals_and_superclass;

class pc {
    int id;
    String comp;

    pc(int id, String comp) {
        this.id = id;
        this.comp = comp;
    }
}
    class total extends pc {
        int price;
        total(int id, String comp, int price){
            super(id,comp);
            this.price = price;
        }
        void display(){
            System.out.println("Id : " + id + " Components : " + comp + " Price : " + price );
        }
    }
    class curr{
        public static void main(String[] args) {
        total p = new total(1000,"Ryzen 5",120000);
        p.display();
        }
    }