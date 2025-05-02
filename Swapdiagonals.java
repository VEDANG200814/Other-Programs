import java.util.*;
public class Swapdiagonals {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the dimension");
        int n=sc.nextInt();
        int a[][]=new int[n][n],k=n-1,t=0;
        System.out.println("Enter the elements");
        for(int i=0;i<n;i++)
        for(int j=0;j<n;j++)
        a[i][j]=sc.nextInt();
        System.out.println("Entered matrix: ");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++)
            System.out.print(a[i][j]+"\t");
            System.out.println();
        }
        for(int i=0;i<n;i++){
            t=a[i][i];
            a[i][i]=a[i][k];
            a[i][k]=t;
            k--;
        }
        System.out.println("Swapped matrix: ");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++)
            System.out.print(a[i][j]+"\t");
            System.out.println();
        }
    }
}