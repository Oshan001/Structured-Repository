interface Animal{
    void makeSound();
}

class Dog implements Animal{
    public void makeSound() {
        System.out.println("Woof!");
    }
    void Bark(){
        System.out.println("Barkkk");
    }
}

class Cat implements Animal{
    public void makeSound(){
        System.out.println("Meow");
    }
}
public class Interface {
    public static void main(String[] args){
        Animal dog = new Dog();
        Animal cat = new Cat();
        Dog dogg = new Dog();
        dog.makeSound();
        dogg.Bark();
        cat.makeSound();
    }
}
