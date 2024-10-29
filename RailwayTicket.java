import java.util.*;
public class RailwayTicket {
    String name,coach;
    long mob_no;
    int amt,totalamt;
    void accept(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name:");
        name=sc.nextLine();
        System.out.println("Enter coach:");
        coach=sc.next();
        System.out.println("Enter your mobile number:");
        mob_no=sc.nextLong();
        System.out.println("Enter the amount:");
        amt=sc.nextInt();
    }
    void update(){
        if(coach.equalsIgnoreCase("First_AC"))
        totalamt=amt+700;
        else if(coach.equalsIgnoreCase("Second_AC"))
        totalamt=amt+500;
        else if(coach.equalsIgnoreCase("Third_AC"))
        totalamt=amt+250;
        else
        totalamt=amt;
    }
    void display(){
        System.out.println("Name: "+name);
        System.out.println("Coach: "+coach);
        System.out.println("Mobile number: "+mob_no);
        System.out.println("Total amount: "+totalamt);
    }
    public static void main(String[] args) {
        RailwayTicket ob=new RailwayTicket();
        ob.accept();
        ob.update();
        ob.display();
    }
}
