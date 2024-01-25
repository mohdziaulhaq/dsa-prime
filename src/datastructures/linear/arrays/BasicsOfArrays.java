package datastructures.linear.arrays;

public class BasicsOfArrays {
    public static void main(String[] args) {
        int age[]; //declaration
        age = new int[5]; // allocation

        // int age[] = new int[5];

        age[0] = 5;
        age[4] = 2;

        System.out.println(age[0]);
        System.out.println(age[1]);
        System.out.println(age.length);

        int marks[] = {12,54,23,44,65};

        for (int i = 0; i < marks.length; i++) {
            System.out.print(marks[i]+" ");
        }

        for (int i : marks) {
            System.out.println(i);
        }
    }
}
