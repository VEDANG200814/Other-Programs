import java.util.*;
public class Recursionpalindrome {
    int isPalin(int n){
        if(n/10>0){
            return (int)Math.pow(10,String.valueOf(n/10).length())*(n%10)+isPalin(n/10);
        }
        return n;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Recursionpalindrome ob= new Recursionpalindrome();
        System.out.println("Enter a number to check palindrome");
        int n=sc.nextInt(),m=ob.isPalin(n);
        if (n==m)
        System.out.printf("%d is a Palindrome number as its reverse%d is equal to the original",n, m);
        else 
        System.out.printf("%d is not a Palindrome number as its reverse%d is not equal to the original",n, m);
    }
}
