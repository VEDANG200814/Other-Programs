import java.util.*;
public class DDAprog {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the elements");
        int a[][]=new int[4][4];
        int p=1,s=0;
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++)
            a[i][j]=sc.nextInt();
        }
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++)
            System.out.print(a[i][j]+"\t");
            System.out.println();
        }
        for(int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                if(i!=j){
                    if(i<j)
                    s+=a[i][j];
                    if(i>j)
                    p*=a[i][j];
                }
            }
        }
        System.out.println("Sum= "+s+"\nProduct= "+p);
    }
}
