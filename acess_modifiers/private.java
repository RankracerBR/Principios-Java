package acess_modifiers;

class A{
    private void display(){
        System.out.println("GeeksforGeeks");
    }
}

class B{
    public static void main(String args[]){
        A obj = new A();

        obj.display();
    }
}