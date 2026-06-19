public class ClassVarFuncVar {
    int data = 20;
    void show(){
        int data = 30;
        System.out.println("Local Scope(Function variable): "+data+"\nClass Variable: "+this.data);
    }
    public static void main(String[] args){
        ClassVarFuncVar obj = new ClassVarFuncVar();
        obj.show();
    }
}
