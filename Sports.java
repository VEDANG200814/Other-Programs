import java.util.*;
public class Sports {
    int height[],n;
    String name;
    Sports(){
        n=0;
        name="";
    }
    Sports(int n,String name){
        this.n=n;
        this.name=name;
        this.height=new int[n];
    }
    void fillHeight(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the heights of "+name);
        for(int i=0;i<n;i++)
            height[i]=sc.nextInt();
    }
    double averageHeight(){
        double avg=0;
        for(int i=0;i<n;i++){
            avg+=height[i];
        }
        avg/=(double)n;
        return avg;
    }
    String compare(Sports s1,Sports s2){
        if(s1.averageHeight()>s2.averageHeight())
        return s1.name;
        else if (s1.averageHeight()<s2.averageHeight())
        return s2.name;
        else
        return "Both teams have the same average height.";
    }
    void display(String msg){
        System.out.println("Team with highest avg height:\n"+msg);
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the name of team 1");
        String name1=sc.next();
        System.out.println("Enter number of players of team 1");
        int n1=sc.nextInt();
        System.out.println("Enter the name of team 2");
        String name2=sc.next();
        System.out.println("Enter number of players of team 2");
        int n2=sc.nextInt();
        Sports ob1=new Sports(n1,name1);
        Sports ob2=new Sports(n2,name2);
        Sports ob3=new Sports();
        ob1.fillHeight();
        ob2.fillHeight();
        ob3.display(ob3.compare(ob1,ob2));
    }   
}