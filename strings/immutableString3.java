package strings;

public class immutableString3 {
    
    public static void main(String[] args){

        String s1 = "knowledge";
        String s2 = s1;
        s1 = s1.concat(" base");

        System.out.println(s1);
    }
}
