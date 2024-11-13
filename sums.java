import java.util.*;
public class sums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number or enter 0 to exit");
        int n=sc.nextInt(),spo=0,spe=0,sn=0;
        while(n!=0){
            if(n>0){
                if(n%2==0)
                spe+=n;
                else
                spo+=n;
            }
            else
            sn+=n;
            System.out.println("Enter a number or enter 0 to exit");
            n=sc.nextInt();
        }
        System.out.println("Sum of positive odd numbers: "+spo+"\nSum of positive even numbers: "+spe+"\nSum of negative numbers: "+sn);
    }
}
