import java.util.*;
public class Longest_string {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the sentence");
        String s=sc.nextLine()+' ';
        int maxl=0;
        String maxw="",w="";char ch;
        for(int i=0;i<s.length();i++){
            ch=s.charAt(i);
            if(ch!=' ')
            w+=ch;
            else{
                if(w.length()>maxw.length())
                maxw=w;
                w="";
            }
        }
        System.out.println("Longest string: "+maxw);
        System.out.println("Length: "+maxw.length());
    }
}
