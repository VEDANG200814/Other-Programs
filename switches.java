import java.util.*;
public class switches {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1 to check automorphic number\nEnter 2 to print the pattern");
        System.out.println("Enter your choice");
        int ch=sc.nextInt();
        switch (ch) {
            case 1:
                System.out.println("Enter a number");
                int n=sc.nextInt();
                int sq=n*n,c=0,n1=n;
                while(n1!=0){
                    n1/=10;
                    c++;
                }
                if(n==sq%(int)Math.pow(10,c))
                System.out.println(n+" is an automorphic number");
                else
                System.out.println(n+" is not an automorphic number");
                break;
            case 2:
                String s="BLUEJ";
                for(int i=0;i<s.length();i++){
                    System.out.print(s.substring(i,s.length())+" ");
                    System.out.println();
                }
                break;
            default:
            System.out.println("Invalid choice");
        }
    }
}
