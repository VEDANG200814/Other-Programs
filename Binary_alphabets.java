import java.util.*;
class Binary_alphabets{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the alphabets in ascending order");
        int n[]=new int[10];
        for(int i=0;i<10;i++)
        n[i]=sc.next().charAt(0);
        System.out.println("Enter character to be searched");
        char c=sc.next().charAt(0);
        int u=9,l=0,m=0,f=0;
        while(u>=l){
            m=(u+l)/2;
            if(c==n[m]){
                f=1;
                break;
            }
            else if(c<n[m])
            u=m-1;
            else if(n[m]<c)
            l=m+1;
        }
        if(f==1)
        System.out.println("Search Successful\nPosition : "+(m+1));
        else
        System.out.println("Search Unsuccessful");
    }
}