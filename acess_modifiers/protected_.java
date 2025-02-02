package acess_modifiers;

public class protected_ {
    protected void display(){
        System.out.println("GeeksforGeeks");
    }
}

class B extends protected_{
    public static void main(String args[]){
        B obj = new B();

        obj.display();
    }
}