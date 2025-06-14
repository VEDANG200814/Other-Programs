import java.util.*;
public class Add {
    int n;
    Add(int a){
        n=a;
    }
    Add sum(Add x,Add y){
        int s=x.n+y.n;
        System.out.println("Sum= "+s);
        return this;
    }
    public static void main(){
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter two numbers");
        int m=sc.nextInt();
        int n=sc.nextInt();
        Add ob1=new Add(m);
        Add ob2=new Add(n);
        Add ob3=new Add(0);
        ob3.sum(ob1, ob2);
    }
}
