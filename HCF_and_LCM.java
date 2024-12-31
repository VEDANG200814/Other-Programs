import java.util.*;
public class HCF_and_LCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int n = sc.nextInt();
        System.out.println("Enter the second number: ");
        int m = sc.nextInt();
        int hcf=0,lcm=0;
        for(int i=1;i<=n*m;i++)
        if(n%i==0&&m%i==0)
        hcf=i;
        lcm=(n*m)/hcf;
        System.out.println("HCF of "+n+" and "+m+" is: "+hcf);
        System.out.println("LCM of "+n+" and "+m+" is: "+lcm);
    }
}
