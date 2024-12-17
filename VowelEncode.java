import java.util.*;
class VowelEncode{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string");
        String s=sc.nextLine().toUpperCase(),s1="",v="AEIOU";
        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            if(v.indexOf(ch)>=0)
            s1+=++ch;
            else
            s1+=ch--;
        }
        System.out.println("New String: "+s1);
    }
}