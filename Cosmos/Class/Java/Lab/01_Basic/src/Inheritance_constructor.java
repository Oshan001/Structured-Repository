public class Inheritance_constructor {
    int data;
    Inheritance_constructor(){
        data = 10;
    }

    Inheritance_constructor(int x){
        data = x;
    }
    public static void main(String[] args){
        Child_constructor c = new Child_constructor();
        c.show();
    }
}

class Child_constructor extends Inheritance_constructor{
    int data;
    Child_constructor(){
        super(1); // Calls the parent constructor
        data = 30;
    }

    void show(){
        System.out.println("\nChild Data: "+data);
        System.out.println("\nParent Data: "+super.data);
    }
}
