import java.util.*;
public class Successivedifference {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of elements");
        int n=sc.nextInt();
        System.out.println("Enter the elements");
        int a[]=new int[n],i,j;
        for(i=0;i<n;i++)
        a[i]=sc.nextInt();
        for(i=0;i<n;i++)
        System.out.print(a[i]+"\t");
        System.out.println();
        for(i=0;i<n;i++){
            for(j=0;j<n-1-i;j++){
                a[j]=Math.abs(a[j+1]-a[j]);
                System.out.print(a[j]+"\t");
            }
            System.out.println();
        }
    }
}
