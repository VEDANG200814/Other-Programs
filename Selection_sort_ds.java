import java.util.*;
class Selection_sort_ds{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the elements");
        int a[]=new int[10],i;
        for(i=0;i<10;i++)
        a[i]=sc.nextInt();
        int t,max,j;
        for(i=0;i<9;i++){
            max=i;
            for(j=i+1;j<10;j++)
            if(a[max]<a[j])
            max=j;
            t=a[max];
            a[max]=a[i];
            a[i]=t;
        }
        for(i=0;i<10;i++)
        System.out.print(a[i]+", ");
    }
}