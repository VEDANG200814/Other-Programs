import java.util.*;
class Linear{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the alphabets");
        int n[]=new int[10];
        for(int i=0;i<10;i++)
        n[i]=sc.next().charAt(0);
        System.out.println("Enter character to be searched");
        char c=sc.next().charAt(0);
        int f=-1;
        for(int i=0;i<n.length;i++)
        if(n[i]==c){
            f=i;
            break;
        }
        if(f>=0)
        System.out.println("Search Successful\nPosition : "+(f+1));
        else
        System.out.println("Search Unsuccessful");
    }
}