import java.util.*;
public class Recursionprimelist{
    int prime(int n,int i){
        if(i>=2){
            if(n%i!=0)
            return prime(n, i-1);
            else
            return -1;
        }
        return n;
    }
    void display(int n,long g){
        if(g>=1){
            int f=prime(n, n-1);
            if(f>=2){
                System.out.println(f);
                display(++n,--g);
            }
            else
            display(++n, g);
        }
    }
    public static void main(String []args){
        long start = System.currentTimeMillis();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        Recursionprimelist ob = new Recursionprimelist();
        ob.display(2,n);
        long end = System.currentTimeMillis();
        System.out.println("Execution time: " + (end - start) + " ms");
    }
}
