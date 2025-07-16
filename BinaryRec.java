import java.util.*;
public class BinaryRec {
    int bin(int n){
        if(n==1)
        return 1;
        else
        return (n%2)+ bin(n/2)*10;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        BinaryRec ob=new BinaryRec();
        System.out.println(ob.bin(n));
    }
}
