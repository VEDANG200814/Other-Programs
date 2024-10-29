import java.util.*;
public class ElectricBill {
    String n;
    int units;
    double bill;
    void accept(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name:");
        n = sc.nextLine();
        System.out.println("Enter the number of units consumed:");
        units = sc.nextInt();
    }
    void calculate(){
        if(units<=100)
        bill = units*2.00;
        else if(units<=200)
        bill = units*2.00 + (units-100)*3.00;
        else{
            bill = units*2.00 + (units-100)*3.00 + (units-200)*5.00;
            bill+=bill*2.5/100.0;
        }
    }
    void print(){
        System.out.println("Name of the customer: "+n);
        System.out.println("Number of units consumed:  "+units);
        System.out.println("Bill amount:  "+bill);
    }
    public static void main(String[] args) {
        ElectricBill ob = new ElectricBill();
        ob.accept();
        ob.calculate();
        ob.print();
    }
}
