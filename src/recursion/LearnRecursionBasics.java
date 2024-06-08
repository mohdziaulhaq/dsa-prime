package recursion;

public class LearnRecursionBasics {
    public static void main(String[] args) {
        // fun(4);
        System.out.println(sumOfN(5));
    }

    static void fun(int n) {
        if (n > 0) {
            fun(n - 1);
            System.out.println(n);

        }

    }

    static int sumOfN(int n) {
        if (n == 1)
            return 1;
        return sumOfN(n - 1) + n;
    }
}
