import java.util.*;
public class ddaproject {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements");
        int n=sc.nextInt();
        System.out.println("Enter the elements");
        int a[][]=new int[n][n],i,j;
        for(i=0;i<n;i++)
            for(j=0;j<n;j++)
                a[i][j]=sc.nextInt();
        System.out.println("DDA in Matrix format:");
        for(i=0;i<n;i++){
            for(j=0;j<n;j++){
                System.out.print(a[i][j]+"\t");
            }
            System.out.println();
        }
        System.out.println("Diagonals of the matrix are:");
        for(i=0;i<n;i++){
            for(j=0;j<n;j++){
                if(i==j||i+j==n-1)
                System.out.print(a[i][j]+"\t");
                else
                System.out.print("\t");
            }
            System.out.println();
        }
        int s=0;
        for(i=0;i<n;i++){
            for(j=0;j<n;j++){
                if(a[i][j]%2==0)
                s+=a[i][j];
            }
        }
        System.out.println("Sum of even elements: "+s);
    }
}
