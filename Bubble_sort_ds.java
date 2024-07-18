import java.util.*;
public class Bubble_sort_ds {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the elements");
        int a[]=new int[10],i;
        for(i=0;i<10;i++)
        a[i]=sc.nextInt();
        int t,j;
        for(i=0;i<9;i++){
            for(j=0;j<9;j++)
            if(a[j+1]>a[j]){
                t=a[j+1];
                a[j+1]=a[j];
                a[j]=t;
            }
        }
        for(i=0;i<10;i++)
        System.out.print(a[i]+", ");
    }
}
