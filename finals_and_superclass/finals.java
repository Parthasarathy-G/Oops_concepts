////FINAL KEYWORD
//
//class check{
//    final int b = 120;
//    public static void main(String[] args) {
//        b = 0;
//        check p = new check();
//        p.hi();
//    }
//    private void hi() {
//            System.out.println(b);
//    }
//}
//
//
////FINALLY METHOD
//
//class Main{
//    public static void main(String[] args) {
//        int n = 10, d = 2;
//        Main m = new Main();
//        m.divide(n,d);
//    }
//    public void divide(int a,int b){
//        try{
//            int div = a/b;
//        }
//        catch (Exception e){
//            System.out.println(e.getMessage());
//        }
//        finally {
//            System.out.println("Executed");
//        }
//    }
//}
//
//
////FINALIZE METHOD
//
/*
class check{
    private String name;
    public check(String name){
        this.name = name;
    }
    public void setName(){
        System.out.println("Reading book : "+name);
    }
    @Override
    protected void finalize() {
        System.out.println("Final book : "+name);
    }
}
public class finals{
    public static void main(String[] args) {
        check m1 = new check("Ps");
        check m2 = new check("Arun");
        m1.setName();
        m2.setName();
        m1 = null;
        m2 = null;
        System.gc();
        try{
            Thread.sleep(100);
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
*/
