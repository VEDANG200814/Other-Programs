import java.util.*;
class Array{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the rows and columns");
        int r=sc.nextInt(),c=sc.nextInt();
        int a[][]=new int[r][c];
        int fr=0,fc=0,lr=r-1,lc=c-1,count=1;
        while(count<=r*c){
            for (int i=fr;i<lr;i++)
            a[i][fc]=count++;
            for(int j=fc;j<lc;j++)
            a[lr][j]=count++;
            for(int k=lr;k>=fr;k--)
            a[k][lc]=count++;
            for(int l=lc-1;l>fc;l--)
            a[fr][l]=count++;
            fr++;
            fc++;
            lr--;
            lc--;
        }
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++)
            System.out.print(a[i][j]+"\t");
            System.out.println();
        }
    }
}