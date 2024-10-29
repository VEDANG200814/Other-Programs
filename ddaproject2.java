import java.util.*;
public class ddaproject2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements");
        int a[][]=new int[4][5],i,j,cs[]=new int[5];
        for(i=0;i<4;i++)
            for(j=0;j<5;j++)
                a[i][j]=sc.nextInt();
        System.out.println("DDA in Matrix format:");
        for(i=0;i<4;i++){
            for(j=0;j<5;j++){
                System.out.print(a[i][j]+"\t");
            }
            System.out.println();
        }
        for(i=0;i<4;i++){
            for(j=0;j<5;j++){
               cs[j]+=a[i][j];
            }
        }
        System.out.println("Sum of each column:");
        for(i=0;i<5;i++)
        System.out.println("Column "+(i+1)+" : "+cs[i]);
    }
}
