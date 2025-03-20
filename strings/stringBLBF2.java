package strings;

public class stringBLBF2 {
    public static void main(String[] args) {
        
        String s = "Geeks";

        StringBuffer sbr = new StringBuffer(s);

        sbr.reverse();

        System.out.println(sbr);

        StringBuilder sbl = new StringBuilder(s);

        sbl.append("forGeeks");

        System.out.println(sbl);
    }   
}
