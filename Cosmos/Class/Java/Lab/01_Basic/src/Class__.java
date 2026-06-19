public class Class__ {
    int n;
    Class__(){
        n = 10;
    }

    void show(){
        System.out.print("n: " + n);
    }

    public static void main(String[] args){
        Class__ c= new Class__();
        c.show();
        System.out.print("\n"+c.n);
    }
}
