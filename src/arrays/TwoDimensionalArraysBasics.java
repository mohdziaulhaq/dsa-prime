package arrays;

public class TwoDimensionalArraysBasics {
    
    public static void main(String[] args) {
        int marks[][] = new int[2][3];

        marks[0][0] = 12;
        marks[0][1] = 13;
        marks[0][2] = 54;
        marks[1][0] = 65;
        marks[1][1] = 76;
        marks[1][2] = 43;

        int markss[][] = {
            {12,13,54},
            {65,76,43}
        };

        for (int[] mark : marks) {
            System.out.println(mark[2]);
        }
    }
}
