import java.util.*;
public class SentenceOfWordsWithVowels {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a sentence");
        String s=sc.nextLine()+' ',w="",s1="",v="AEIOUaeiou";
        char ch;
        for(int i=0;i<s.length();i++){
            ch=s.charAt(i);
            if(ch!=' ')
            w+=ch;
            else{
                for(int j=0;j<w.length();j++)
                if(v.indexOf(w.charAt(j))>=0){
                    s1+=w+' ';
                    break;
                }
                w="";
            }
        }
        System.out.println("New String: \n"+s1);
    }
}