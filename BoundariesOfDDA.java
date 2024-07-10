import java.util.*;
public class BoundariesOfDDA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements");
        int a[][]=new int[4][4];
        for(int i=0;i<4;i++)
            for(int j=0;j<4;j++)
            a[i][j]=sc.nextInt();
        System.out.println("DDA in matrix format:");
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                System.out.print(a[i][j]+"\t");
            }
            System.out.println();
        }
        System.out.println("Boundaries of the DDA:");
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                if(i==0||j==0||i==3||j==3)
                System.out.print(a[i][j]+"\t");
                else
                System.out.print("\t");
            }
            System.out.println();
        }
    }
}
