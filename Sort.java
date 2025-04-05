import java.util.*;
public class Sort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of elements");
        int n=sc.nextInt();
        int a[]=new int[n],b[]=new int[n];
        int max,min,t;
        System.out.println("Enter the elements");
        for(int i=0;i<n;i++)
        b[i]=sc.nextInt();
        a=b;
        //selction sort in ascending order
        for(int i=0;i<n-1;i++){
            min=i;
            for(int j=i+1;j<n;j++)
            if(a[j]<a[min])
            min=j;
            t=a[i];
            a[i]=a[min];
            a[min]=t;
        }
        for(int i=0;i<n;i++)
        System.out.print(a[i]+", ");
        System.out.println();
        //Selection sort in descending order
        a=b;
        for(int i=0;i<n-1;i++){
            max=i;
            for(int j=i+1;j<n;j++)
            if(a[j]>a[max])
            max=j;
            t=a[i];
            a[i]=a[max];
            a[max]=t;
        }
        for(int i=0;i<n;i++)
        System.out.print(a[i]+", ");
        System.out.println();
        //Bubble sort in ascending order
        a=b;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++)
            if(a[j]>a[j+1]){
                t=a[j];
                a[j]=a[j+1];
                a[j+1]=t;
            }
        }
        for(int i=0;i<n;i++)
        System.out.print(a[i]+", ");
        System.out.println();
        //Bubble sort in descending order
        a=b;
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++)
            if(a[j]<a[j+1]){
                t=a[j];
                a[j]=a[j+1];
                a[j+1]=t;
            }
        }
        for(int i=0;i<n;i++)
        System.out.print(a[i]+", ");
    }
}
