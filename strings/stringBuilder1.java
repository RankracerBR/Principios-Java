package strings;

public class stringBuilder1 {
    
    public static void main(String[] args){

        StringBuilder sb = new StringBuilder("GeeksforGeeks");
        System.out.println("Initial StringBuilder: " + sb);

        sb.append(" is awesome!");
        System.out.println("After append: " + sb);

        sb.insert(13, "Java");
        System.out.println("After insert: " + sb);

        sb.replace(0, 5, "Welcome to");
        System.out.println("After replace: " + sb);

        sb.delete(8, 14);
        System.out.println("After delete: " + sb);

        sb.reverse();
        System.out.println("After reverse: " + sb);

        int capacity = sb.capacity();
        System.out.println("Current capacity: " + capacity);

        int length = sb.length();
        System.out.println("Current length: " + length);

        char chartAt5 = sb.charAt(5);
        System.out.println("Character at index 5: " + chartAt5);

        sb.setCharAt(5, 'X');
        System.out.println("After setCharAt: " + sb);

        String substring = sb.substring(5, 10);
        System.out.println("Substring (5 to 10): " + substring);

        sb.reverse();
        int indexOfGeeks = sb.indexOf("Geeks");
        System.out.println("Index of 'Geeks': " + indexOfGeeks);

        sb.deleteCharAt(5);
        System.out.println("After deleteCharAt: " + sb);

        String result = sb.toString();
        System.out.println("Final String: " + result);
    }
}
