package datastructures.linear.arrays;

public class LastNumberInSortedPosition {
    public static void main(String[] args) {

        int a[] = {2,6,8,9,3};
        int result[] = lastNumberInSortedPosition(a);
        for (int i : result) {
            System.out.print(i+" ");
        }
    }
    private static int[] lastNumberInSortedPosition(int[] a) {
        int n = a.length;
        int last = a[n-1];
        int swapIndex = n-2;

        while(swapIndex >= 0 && a[swapIndex] > last){
            swapIndex--;
        }
        for(int i = n-1; i >= swapIndex+2; i--){
            a[i] = a[i-1];
        }
        a[swapIndex+1] = last;
        return a;
    }
}
