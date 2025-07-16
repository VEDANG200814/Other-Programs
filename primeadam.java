import java.util.*;
class PrimeAdam{
    int reverse(int n){
        int n1=0;
        while(n>0){
            n1=n1*10+n%10;
            n/=10;
        }
        return n1;
    }
    boolean isPrime(int n){
        int c=0;
        if(n<2)
        return false;
        for(int i=2;i<n;i++){
            if(n%i==0)
            return false;
        }
        return true;
    }
    boolean isAdam(int n){
        int sq=n*n,sq1=reverse(sq),n1=reverse(n),sqr=n1*n1;
        if(n1==n && sq1==sqr)        
        return true;
        return false;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        PrimeAdam ob=new PrimeAdam();
        if(ob.isPrime(n)&&ob.isAdam(n)){
            System.out.println(n+" is a PrimeAdam number");
        }
        else
            System.out.println(n+" is a not PrimeAdam number");
    }
}