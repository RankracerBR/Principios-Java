package methods;
import java.io.*;

class Test{
    String n = "";

    public void test(String n){
        this.n = n;
    }
}

public class instancemethod {
    public static void main(String[] args){
        Test t = new Test();

        t.test("GeeksforGeeks");
        System.out.println(t.n);
    }
}
