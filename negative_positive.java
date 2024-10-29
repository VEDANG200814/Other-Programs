import java.util.*;
public class negative_positive {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements");
        int n[] = new int[10],a[]=new int[10],i,k=0;
        for(i=0;i<10;i++)
        n[i]=sc.nextInt();
        for(i=0;i<10;i++){
            if(n[i]<0){
                a[k]=n[i];
                k++;
            }
        }
        for(i=0;i<10;i++){
            if(n[i]>0){
                a[k]=n[i];
                k++;
            }
        }
        for(i=0;i<10;i++)
        System.out.print(a[i]+", ");
    }
}