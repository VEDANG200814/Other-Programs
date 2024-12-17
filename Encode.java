import java.util.*;
public class Encode {
    static String s;
    void convert(int n){
        String w="";char ch;
        for(int i=0;i<s.length();i++){
            ch=s.charAt(i);
            if(ch!=' '){                
                if(Character.isLowerCase(ch))
                    w+=(char)((ch-'a'+n)%26+'a');
                else if(Character.isUpperCase(ch))
                    w+=(char)((ch-'A'+n)%26+'A');
            }
            else
            w+=ch;
        }
        System.out.println("New string: "+w);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Encode ob=new Encode();
        System.out.println("Enter a string:");
        s=sc.nextLine();
        System.out.println("Enter the shift value:");
        int n=sc.nextInt();
        ob.convert(n);
    }
}
