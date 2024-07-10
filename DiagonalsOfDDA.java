import java.util.*;
public class DiagonalsOfDDA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the elements");
        int a[][]=new int[4][4],i,j;
        for(i=0;i<4;i++)
            for(j=0;j<4;j++)
                a[i][j]=sc.nextInt();
        System.out.println("DDA in Matrix format:");
        for(i=0;i<4;i++){
            for(j=0;j<4;j++){
                System.out.print(a[i][j]+"\t");
            }
            System.out.println();
        }
        System.out.println("Diagonals of the matrix are:");
        int c=3;
        for(i=0;i<4;i++){
            for(j=0;j<4;j++){
                if(i==j||j==c)
                System.out.print(a[i][j]+"\t");
                else
                System.out.print("\t");
            }
            System.out.println();
            c--;
        }
    }
}
