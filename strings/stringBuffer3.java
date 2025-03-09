package strings;
import java.io.*;

class StringBuffer3{

    public static void main(String[] args){

        StringBuffer sb = new StringBuffer("Hello ");
        sb.insert(1, "Java");

        System.out.println(sb);
    }
}
