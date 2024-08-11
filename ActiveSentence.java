import java.util.*;
public class ActiveSentence {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a sentence");
        String s=sc.nextLine().toLowerCase()+' ';
        int i,f=1;char ch;
        for(char ch1='a';ch1<='z';ch1++){
            for(i=0;i<s.length();i++){
                ch=s.charAt(i);
                if(ch1==ch&&ch!=' ')
                break;
            }
            if(i==s.length()){
                f=0;
                break;
            }
        }
        if(f==0)
        System.out.println("The given sentence is not an Active Sentence");
        else
        System.out.println("The given sentence is an Active Sentence");
    }
}
