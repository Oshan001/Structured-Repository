class Parent {
    void show(){
        System.out.println("Hello");
    }
}

class Child extends Parent {
    @Override
    void show(){
        System.out.println("Hiii! Function overrided!!");
    }
}

public class Overriding {
    public static void main(String[] args){
        Child c = new Child();
        c.show();
    }
}