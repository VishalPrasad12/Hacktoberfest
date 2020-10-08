// given a array & find gratest contiguous sub array of of size k
import java.util.Scanner;
public class GreaterContiguousSubArray {
    static void swap(int A[],int B[])
    {
        for(int i=0;i<A.length;i++)
        {
            int temp = A[i];
            A[i] = B[i];
            B[i] = temp;
        }
    }
    //function to sort
    static void sortSubArrays(int A[][])
    {
        int k=0;
        for(int i=0;i<A.length-1;i++)
        {
            for(int j=i+1;j<A.length;j++)
            {
                if(A[i][k]>A[j][k])
                GreaterContiguousSubArray.swap(A[i],A[j]);
                else if(A[i][k]==A[j][k])
                {
                    for(int l=k+1;l<A[0].length;l++)
                        if(A[i][l]>A[j][l])
                        swap(A[i],A[j]);
                }
            }
    }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int n = sc.nextInt();
        int [] arr = new int[n];
        System.out.println("Enter the array : ");
        for(int i=0;i<n;i++)
        {
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the size of the subarray : ");
        int k = sc.nextInt();
        int [][]subArrays = new int[n-k+1][k];
        int row = 0,col = 0;
        for(int i=0;i<n-k+1;i++)
        {
            for(int j=i;j<=i+k-1;j++)
            {
                subArrays[row][col++] = arr[j];
            }
            row++;
            col=0;
        }
        // for(int i=0;i<subArrays.length;i++)
        // {
        //     for(int j=0;j<subArrays[i].length;j++)
        //     System.out.print(subArrays[i][j]+" ");
        //     System.out.println();
        // }
        GreaterContiguousSubArray.sortSubArrays(subArrays);
        // System.out.println();
        // for(int i=0;i<subArrays.length;i++)
        // {
        //     for(int j=0;j<subArrays[i].length;j++)
        //     System.out.print(subArrays[i][j]+" ");
        //     System.out.println();
        // }
        System.out.println("The greatest contiguous subarray of size "+k+" is : ");
        for(int i=0;i<k;i++)
            System.out.print(subArrays[subArrays.length-1][i]+" ");
    }   

}
