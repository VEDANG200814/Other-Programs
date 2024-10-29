import java.util.*;
public class DDAProgramsCompilation {
    public static void main(String arg[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements");
        int n=sc.nextInt(),i,j,a[][]=new int[n][n],sld=0,srd=0,ser=0,sor=0;
        System.out.println("Enter the elements");
        for(i=0;i<n;i++)
        for(j=0;j<n;j++)
        a[i][j]=sc.nextInt();
        System.out.println("DDA in matrix format");
        for(i=0;i<n;i++){
            for(j=0;j<n;j++)
            System.out.print(a[i][j]+"\t");
            System.out.println();
        }
        for(i=0;i<n;i++){
            sld+=a[i][i];
            for(j=0;j<n;j++)
            if(i+j==n-1)
            srd+=a[i][j];
        }
        if(sld==srd)
        System.out.println("Sum of Left diagonal elements is equal to the Right diagonal elements");
        else
        System.out.println("Sum of Left diagonal elements is not equal to the Right diagonal elements");
        System.out.println("Four corner elements of DDA");
        for(i=0;i<n;i++){
            for(j=0;j<n;j++)
            if((i==0||i==n-1)&&(j==0||j==n-1))
            System.out.print(a[i][j]+"\t");
            else
            System.out.print("\t");
            System.out.println();
        }
        for(i=0;i<n;i++){
            for(j=0;j<n;j++)
            if(i%2==0)
            sor+=a[i][j];
            else
            ser+=a[i][j];
        }
        if(ser==sor)
        System.out.println("Sum of Even row elements is equal to the Odd row elements");
        else
        System.out.println("Sum of Even row elements is not equal to the Odd row elements");
        System.out.println("Boundary elements of DDA");
        for(i=0;i<n;i++){
            for(j=0;j<n;j++)
            if(i==0||j==0||j==n-1||i==n-1)
            System.out.print(a[i][j]+"\t");
            else
            System.out.print("\t");
            System.out.println();
        }
    }
}
