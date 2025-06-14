import java.util.*;
class Recursionsum{
    int sum(int n){
        if(n>=1)
        return n+sum(n-1);
        return n;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Recursionsum ob=new Recursionsum();
        System.out.println("Enter the number of no.s");
        int n=sc.nextInt();
        System.out.println("Sum= "+ob.sum(n));
    }
}