import java.util.*;
public class Students {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of students");
        int n=sc.nextInt();
        String[] name=new String[n];
        int roll[]=new int[n],m1[]=new int[n],m2[]=new int[n],m3[]=new int[n];
        double avg[]=new double[n];
        for(int i=0;i<n;i++){
            System.out.println("Enter the name of student");
            name[i]=sc.next();
            System.out.println("Enter the roll number of student");
            roll[i]=sc.nextInt();
            System.out.println("Enter the marks of student in subject 1");
            m1[i]=sc.nextInt();
            System.out.println("Enter the marks of student in subject 2");
            m2[i]=sc.nextInt();
            System.out.println("Enter the marks of student in subject 3");
            m3[i]=sc.nextInt();
        }
        System.out.println("Name\tRoll no.\tAverage\tRemarks");
        for(int i=0;i<n;i++){
            avg[i]=(m1[i]+m2[i]+m3[i])/3.0;
            System.out.print(name[i]+"\t"+roll[i]+"\t"+avg[i]);
            if(avg[i]>=85&&avg[i]<=100)
            System.out.println("Excellent");
            else if(avg[i]>=75)
            System.out.println("Distinction");
            else if(avg[i]>=60)
            System.out.println("First Class");
            else if(avg[i]>=40)
            System.out.println("Pass");
            else
            System.out.println("Poor");
        }
    }
}
