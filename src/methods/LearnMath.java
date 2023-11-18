package methods;

public class LearnMath {
    public static void main(String[] args) {
        int a = 4;
        int b = 7;

        System.out.println("Max :"+Math.min(a, b));
        System.out.println("Min :"+Math.max(16,44));
        System.out.println("Pow :"+Math.pow(3,4));
        System.out.println("Sqrt :"+Math.sqrt(16));
        System.out.println("Abs :"+Math.abs(-16));
        System.out.println("Random :"+Math.random());
        System.out.println("Floor :"+Math.floor(16.4));
        System.out.println("Ceil :"+Math.ceil(16.4));
        System.out.println("Round :"+Math.round(16.5));

        System.out.println("Random number between 1 to 100 :"+ Math.round(Math.random()*100));


    }
}
