public class Day5 {
    public static void main(String[] args) {
        // int a= 13;
        // int add=a+5;
        // int sub=a-5;
        // int multi= sub*a;
        // float div= multi/sub;
        // float mod = multi%sub;
        // float mod1 = 20%21;
        // System.out.printf("sum of %d + 5 is :%d\n",a,add);
        // System.out.printf("difference of %d - 5 is :%d\n",a,sub);
        // System.out.printf("multiply of %d * %d is :%d\n",sub,a,multi);
        // System.out.printf("division of %d / %d is :%f\n",multi,sub,div);
        // System.out.printf("modulus of %d %% %d is :%f\n",multi,sub,mod);
        // System.out.printf("modulus of %d %% %d is :%f\n",multi,sub,mod1);
        // System.out.println(12>13? "true":"false");
        // System.out.println(12<13? "true":"false");
        // System.out.println(12>13 && 120>12 ? "true":"false");
        // System.out.println(12>13 || 120>12 ? "true":"false");


        //bitwise operator
        int b = 11; 
        int c = 10;
        int and = b & c;
        int or = b | c;
        int xor = b ^ c;
        System.out.println("Bitwise AND: " + and);
        System.out.println("Bitwise OR: " + or);
        System.out.println("Bitwise XOR: " + xor);
        System.out.println("Bitwise NOT: " + ~b);
    }
}
