package arrays;

class Student2 {
    public String name;

    Student2(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}

public class Main2 {
    public static void main(String[] args) {
        
        Student2[] myStudents = new Student2[]{
            new Student2("Dharma"), new Student2("sanvi"),
            new Student2("Rupa"), new Student2("Ajay")
        };

        for (Student2 m : myStudents) {
            System.out.println(m);
        }
    }
}


class GFG {
    public static void main(String[] args) {
        int[] arr = new int[4];
        arr[0] = 10;
        arr[1] = 20;
        arr[2] = 30;
        arr[3] = 40;

        // System.out.println("Trying to access element outside the size of array");
        // System.out.println(arr[5]);
    }
}
