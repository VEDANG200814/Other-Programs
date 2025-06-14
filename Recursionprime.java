import java.util.*;
public class Recursionprime {
    boolean prime(int n,int i){
        if(i>=2){
            if(n%i!=0)
            return prime(n, i-1);
            return false;
        }
        return true;
    }
    public static void main(String []args){
        long s=System.currentTimeMillis();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        Recursionprime ob = new Recursionprime();
        System.out.println(ob.prime(n, n-1));
        long e=System.currentTimeMillis();
        System.out.println("Time: "+(e-s));
    }
}
