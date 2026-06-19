import java.util.Scanner;
public class MultipleClasses {
    public static void main(String[] args){
        Human h = new Human();
        h.getData();
        h.showData();
    }
}

class Human{
    int eyes, legs;
    String name;

    Human(){
        legs = eyes = 2;
    }
    void getData(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name, no. of eyes and legs: ");
        name = sc.nextLine();
        eyes = sc.nextInt();
        legs = sc.nextInt();
    }

    void showData(){
        System.out.println("Eyes: "+eyes+"\t"+"Legs:"+ legs+"\t"+"Name:"+name);
    }
}
