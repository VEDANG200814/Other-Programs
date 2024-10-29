import java.util.*;
public class Special_palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a word");
        String s = sc.next().toUpperCase(),w="";
        char ch=s.charAt(0);
        if(s.length()-1==s.lastIndexOf(ch)){
            for(int i=0;i<s.length();i++){
                w=s.charAt(i)+w;
            }
            if(w.equals(s))
            System.out.println(s+" is a special and a palindrome word");
            else
            System.out.println(s+" is a special word");
            
        }
        else
        System.out.println(s+" is neither a special nor a palindrome word");
    }
}