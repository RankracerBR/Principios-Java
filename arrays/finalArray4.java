package arrays;

class Array4 {
    int p = 20;

    public static void main(String[] args) {
        
        final Array4 a1 = new Array4();
        Array4 a2 = new Array4();

        a1 = a2;
        
        System.out.println(a1.p);
    }
}