import java.util.*;
public class s_rowS_n_s_coloumnS {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        System.out.println("Enter the elements");
        int r=3,c=5,a[][]=new int[r][c],s_row[]=new int[r],s_coloumn[]=new int[c],i,j;
        for(i=0;i<r;i++){
            for(j=0;j<c;j++)
            a[i][j]=sc.nextInt();
        }
        System.out.println("Entered matrix: ");
        for(i=0;i<r;i++){
            for(j=0;j<c;j++)
            System.out.print(a[i][j]+"\t");
            System.out.println();
        }
        for(i=0;i<r;i++){
            for(j=0;j<c;j++){
                s_row[i]+=a[i][j];
                s_coloumn[j]+=a[i][j];
            }
        }
        System.out.println("SUM OF ROWS: ");
        for(i=0;i<r;i++)
        System.out.println("Row "+(i+1)+": "+s_row[i]);
        System.out.println("SUM OF COLOUMNS: ");
        for(i=0;i<c;i++)
        System.out.println("Coloumn "+(i+1)+": "+s_coloumn[i]);
    }
}
