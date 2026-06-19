public class ClassWithFunctions {
    void show(){
        System.out.println("Class Main");
    }
    public static void main(String[] args){
        Replica r = new Replica();
        r.show();
        ClassWithFunctions c = new ClassWithFunctions();
        c.show();
    }
}

class Replica {
    void show(){
        System.out.println("Class Duplicate!");
    }
}
