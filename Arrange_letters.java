import java.util.*;
public class Arrange_letters {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a sentence");
        String s=sc.next().toUpperCase(),s1="";
        char ch;
        for(int i=65;i<=90;i++){
            for(int j=0;j<s.length();j++){
                ch=s.charAt(j);
                if(ch==(char)i)
                s1+=ch;
            }
        }
        System.out.println("New string: "+s1);
    }
}
