package strings;

public class stringBuffer {
    
    public static void main(String[] args){
    StringBuffer s = new StringBuffer();

    s.append("Hello");
    s.append(" ");
    s.append("world");

    String str = s.toString();
    System.out.println(str);
    }
}
