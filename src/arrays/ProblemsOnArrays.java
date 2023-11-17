package arrays;

public class ProblemsOnArrays {
    public static void main(String[] args) {
        int numbers[] = {23,12,1,6,7,10};

        int sum =0;
        for(int number : numbers){
            sum += number;
        }

        System.out.println("sum is "+sum);

        int min = Integer.MAX_VALUE;
        for (int number : numbers) {
            if(number < min){
                min = number;
            }
        }

        System.out.println("min is "+min);
    }
}
