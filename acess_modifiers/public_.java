package acess_modifiers;

public class public_ {
    public void display(){
        System.out.println("GeeksforGeeks");
    }
}

class B {
    public static void main(String args[]){
        public_ obj = new public_();
        obj.display();
    }
}