package methods;
import java.io.*;

class test{

    static void hello()
    {
        System.out.println("Hello");
    }
}

class staticmethod {
    public static void main(String[] args){
        test.hello();
    }
}

class Geeks{
    public static void greet(){
        System.out.println("Hello Geek!");
    }

    public static void main(String[] args){
        greet();

        Geeks.greet();
    }
}