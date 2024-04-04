import java.util.Arrays; 
public class MergeArrays {
    public static void mergeArrays(int[] X, int m, int[] Y, int n) {
        int i = m - 1; 
        int j = n - 1; 
        int k = m + n - 1; 

        
        while (j >= 0) {
           
            if (i >= 0 && X[i] > Y[j]) {
                X[k--] = X[i--];
            } else {
                X[k--] = Y[j--];
            }
        }
    }

    public static void main(String[] args) {
        int[] X = { 0, 2, 0, 3, 0, 5, 6, 0, 0 }; 
        int[] Y = { 1, 8, 9, 10, 15 }; 
        int m = 9;
        int n = 5;

        mergeArrays(X, m, Y, n);

        
        for (int element : X) {
            System.out.print(element + " ");
        }
        
    }
}
