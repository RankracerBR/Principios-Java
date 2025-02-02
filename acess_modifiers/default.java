package acess_modifiers;
import methods.*;

class Geek {
    void display(){
        System.out.println("Hello World!");
    }
}


class GeekNew{
    public static void main(String[] args){
        Geek o = new Geek();

        o.display();
    }
}