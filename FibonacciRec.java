import java.util.*;
public class FibonacciRec {
    int fibo(int n){
        if(n==1)
        return 0;
        else if(n==2)
        return 1;
        else
        return fibo(n-1)+fibo(n-2);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of terms");
        int n=sc.nextInt();
        FibonacciRec ob=new FibonacciRec();
        System.out.println("The "+n+"th term of the series is: "+ob.fibo(n));
    }
}
