import java.util.*;
public class Arrange_digits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number");
        int n=sc.nextInt();
        int n1,d=0;
        if(String.valueOf(n).length()>=3){
            for(int i=0;i<=9;i++){
                n1=n;
                while(n1!=0){
                    d=n1%10;
                    if(d==i)
                    System.out.print(d+", ");
                    n1/=10;
                }
            }
        }
        else
        System.out.println("Number too small!!");
    }
}
