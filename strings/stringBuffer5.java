package strings;

class StringBuffer5{

    public static void main(String[] args){

        StringBuffer sb = new StringBuffer("Hello");
        sb.delete(1, 3);
        System.out.println(sb);
    }
}
