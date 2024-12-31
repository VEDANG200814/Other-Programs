import java.util.*;
public class Palindrome_word {
    String palin(String s){
        String s1="";
        for(int i=s.length()-1;i>=0;i--){
            s1=s1+s.charAt(i);
        }
        return s1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Palindrome_word ob = new Palindrome_word();
        System.out.println("Enter a word: ");
        String s=sc.next();
        if(s.equalsIgnoreCase(ob.palin(s)))
        System.out.println(s+" is a palindrome word");
        else
        System.out.println(s+" is not a palindrome word");
    }
}
