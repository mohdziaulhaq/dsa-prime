package week1;

public class Patterns {
    public static void main(String[] args) {

        //Pattern1
        // int n=8;
        // for (int i = 0; i <= n; i++) {
        //     for (int j = 0; j <= n; j++) {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        //Pattern2
        // int n=8;
        // for (int i = 0; i <= n; i++) {
        //     for (int j = 0; j <= i; j++) {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        //Pattern3
        //  int n=6;
        // for (int i = 1; i <= n; i++) {
        //     for (int j = 1; j <= i; j++) {
        //         System.out.print(j+" ");
        //     }
        //     System.out.println();
        // }

        //Pattern4
         int n=6;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
