package varargs;
import java.io.*;


class Geeks{
    public static void Names(String... n){
        
        for(String i: n){
            System.out.println(i + " ");
        }
        System.out.println();
    }

    public static void main(String[] args){
        Names("geek1", "geek2");
        Names("geek1", "geek2", "geek3");

    }
}

class Test1{
    static void fun(int... a){
        System.out.println("Number of arguments:" + a.length);
    
    for (int i: a)
        System.out.print(i + " ");
        System.out.println();
    }

    public static void main(String args[]){

        fun(100);

        fun(1, 2, 3, 4);

        fun();
    }
}
