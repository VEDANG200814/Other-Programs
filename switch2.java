import java.util.*;
public class switch2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1 to print pattern\nEnter 2 to print sum of series");
        System.out.println("Enter your choice");
        int ch=sc.nextInt();
        switch(ch){
            case 1:
                char c='A';
                for(int i=1;i<=5;i++){
                    for(int j=1;j<=i;j++){
                        System.out.print(c+" ");
                        c++;
                    }
                    System.out.println();
                }
                break;
            case 2:
                double s=0.0,k=1,f=1;
                System.out.println("Enter the number of terms");
                int n=sc.nextInt();
                while(k<=n){
                    for(int i=1;i<=k;i++)
                    f*=i;
                    s+=(double)k/f;
                    k+=2;
                    f=1;
                }
                System.out.println("Sum= "+s);
                break;
            default:
            System.out.println("Invalid choice");

        }
    }
}
