import java.util.*;
public class Grade_Revision {
    String name;
    int bas,expn;
    double inc,nbas;
    Grade_Revision(){
        name = "";
        bas = 0;
        expn = 0;
        inc = 0.0;
        nbas = 0.0;
    }
    void accept(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name:");
        name = sc.nextLine();
        System.out.println("Enter basic salary:");
        bas=sc.nextInt();
        System.out.println("Enter years of experience:");
        expn = sc.nextInt();
    }
    void increment(){
        if(expn<=3)
        inc=1000+10.0/100.0*bas;
        else if(expn<=5)
        inc=3000+12.0/100.0*bas;
        else if(expn<=10)
        inc=5000+15.0/100.0*bas;
        else
        inc=8000+20.0/100.0*bas;
        nbas=bas+inc;
    }
    void display(){
        System.out.println("Name: "+name);
        System.out.println("Basic salary: "+bas);
        System.out.println("Experience: "+expn);
        System.out.println("Increment: "+inc);
        System.out.println("New Basic salary: "+nbas);
    }
    public static void main(String[] args) {
        Grade_Revision ob = new Grade_Revision();
        ob.accept();
        ob.increment();
        ob.display();
    }
}
