import java.util.*;
class Array3{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of rows and columns");
        int n=sc.nextInt();
        int a[][]=new int[n][n],b[][]=new int[n][n],ln=n-1;
        System.out.println("Enter the elements");
        for(int i=0;i<n;i++)
        for(int j=0;j<n;j++)
        a[i][j]=sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++)
            b[j][ln]=a[i][j];
            ln--;
        }
        System.out.println("Original matrix");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++)
            System.out.print(a[i][j]+"\t");
            System.out.println();
        }
        System.out.println("Rotated matrix:");
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++)
            System.out.print(b[i][j]+"\t");
            System.out.println();
        }
    }
}