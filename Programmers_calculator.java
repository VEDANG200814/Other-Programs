import java.util.*;
class Programmers_calculator{
    int s=0,c=0;
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        int n=sc.nextInt();
        System.out.println("Enter the base from which it has to be cahnged");
        int b=sc.nextInt();
        Programmers_calculator ob=new Programmers_calculator();
        switch(b){
            case 2:
                ob.fromBinary(n);
                break;
            case 8:
                ob.fromOctal(n);
                break;
            case 16:
                ob.fromHexa(n);
                break;
            default:
                System.out.println("Wrong Input!");
        }
    }
    void fromBinary(int n){
        while(n!=0){
            s+=(n%10)*(int)(Math.pow(2,c));
            n/=10;
            c++;
        }
        System.out.println("Binary number: "+s);
    }
    void fromOctal(int n){
        while(n!=0){
            s+=(n%10)*(int)(Math.pow(8,c));
            n/=10;
            c++;
        }
        System.out.println("Octal number: "+s);
    }
    void fromHexa(int n){
        while(n!=0){
            s+=(n%10)*(int)(Math.pow(16,c));
            n/=10;
            c++;
        }
        System.out.println("Hexadecimal number: "+s);
    }
}