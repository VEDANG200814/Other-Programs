import java.util.*;
public class Name_sort {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of names");
        int n=sc.nextInt();
        sc.nextLine();
        String na[]=new String[n],t;
        System.out.println("Enter names");
        for(int i=0;i<n;i++)
        na[i]=sc.nextLine();
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-1-i;j++)
            if(na[j+1].compareTo(na[j])<=0){
                t=na[j+1];
                na[j+1]=na[j];
                na[j]=t;
            }
        }
        System.out.println("Arranged name list");
        for(int i=0;i<n;i++)
        System.out.println(na[i]);
    }
}