package strings;

class StringBuffer7{

    public static void main(String args[]){
    
    StringBuffer sb = new StringBuffer();
    sb.append("Hello");

    System.out.println(sb.capacity());
    sb.append("Java is my favourite language");

    System.out.println(sb.capacity());
    }
}