package strings;

public class concatString3 {
    
    public static void main(String[] args) {
        
        String s1 = "Computer-";
        String s2 = null;


        String s3 = s1.concat(s2);

        System.out.println(s3); // error
    }
}
