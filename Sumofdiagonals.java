import java.util.*;
public class Sumofdiagonals {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the dimension");
        int n=sc.nextInt();
        int a[][]=new int[n][n],sld=0,srd=0;
        System.out.println("Enter the elements");
        for(int i=0;i<n;i++)
        for(int j=0;j<n;j++)
        a[i][j]=sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++)
            System.out.print(a[i][j]+"\t");
            System.out.println();
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(i==j)
                sld+=a[i][j];
                if(i+j==n-1)
                srd+=a[i][j];
            }
        }
        System.out.println("Sum of left diagonal: "+sld+"\nSum of right diagonal: "+srd);
    }   
}
