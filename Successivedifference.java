import java.util.*;
public class Successivedifference {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the elements");
        int a[]=new int[6],i,j;
        for(i=0;i<6;i++)
        a[i]=sc.nextInt();
        for(i=0;i<6;i++)
        System.out.print(a[i]+"\t");
        System.out.println();
        for(i=0;i<6;i++){
            for(j=0;j<5-i;j++){
                a[j]=a[j+1]-a[j];
                System.out.print(a[j]+"\t");
            }
            System.out.println();
        }
    }
}
