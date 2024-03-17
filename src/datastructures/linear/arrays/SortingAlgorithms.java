package datastructures.linear.arrays;

public class SortingAlgorithms {
    public static void main(String[] args) {
        int a[] = {12,1,16,3,8,5,4};
        // bubbleSort(a);
        // selectionSort(a);
        for (int i : a) {
            System.out.print(i+" ");
        }
    }

    public static void bubbleSort(int[] a) {

        boolean didISwap = false;// To end lopp if we don't swap once
        int n = a.length;

        for(int i=0; i<n-1; i++){
            for(int j=0; j<n-i-1; j++){
                if(a[j] > a[j+1]){
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                    didISwap = true;
                }
                if(!didISwap) break; // If we did not swap then break, because array is sorted
            }
        }
    }

    public static void selectionSort(int[] a){
        int n = a.length;

        for(int i=0; i<n-1; i++){
            int min = i; // assume i as min index at start of every iteration
            for(int j=i; j<n; j++){
                if(a[min] > a[j]){
                    min = j;
                }
            }
            int temp = a[min];
            a[min] = a[i];
            a[i] = temp;
        }
    }
}