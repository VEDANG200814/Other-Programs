import java.util.*;
class Jump_String{
    boolean isprime(int s){
        int c=0;
        for(int i=1;i<=s;i++)
        if(s%i==0)
        c++;
        if(c==2)
        return true;
        return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Jump_String ob=new Jump_String();
        System.out.println("Enter a string");
        String s=sc.nextLine();
        int chs=0;
        for(int i=0;i<s.length();i++)
            chs+=s.charAt(i);
        if(ob.isprime(chs))
        System.out.println(s+ " is a Jump String");
        else
        System.out.println(s+" is not a Jump String");
    }
}