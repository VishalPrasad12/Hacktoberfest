import java.util.Scanner;
public class CorelationFactorOfArray {
    

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the no of elements in the arrays: ");
        int n = scan.nextInt();
        int[] A = new int[n];
        System.out.print("Enter the elements of  first array : ");
        for (int i = 0; i < A.length; i++)
          A[i] = scan.nextInt();
        int[] B = new int[n];
        System.out.print("Enter the elements of  second array : ");
        for (int i = 0; i < B.length; i++)
          B[i] = scan.nextInt();
        int[] C = new int[n - 1];
        for (int i = 0; i < n - 1; i++) {
          if (A[i] > A[i + 1] && B[i] > B[i + 1] || A[i] < A[i + 1] && B[i] < B[i+1] || A[i] == A[i + 1] && B[i] == B[i + 1])
            C[i] = 1;
          else
            C[i] = 0;
        }
        int sumOfZeroes = 0, sumOfOnes = 0;
        for (int i = 0; i < n - 1; i++) {
          if (C[i] == 0)
            sumOfZeroes = sumOfZeroes + C[i];
          else
            sumOfOnes = sumOfOnes + C[i];
        }
        System.out.println("Corelation COefficient is " + ((float) sumOfOnes / (sumOfZeroes + sumOfOnes)));
      }
}