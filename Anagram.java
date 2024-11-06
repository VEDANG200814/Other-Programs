import java.util.*;
public class Anagram {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter two words");
        String w1=sc.next(),w2=sc.next();
        int f=1;
        if(w1.length()==w2.length()){
            for(int i=0;i<w1.length();i++){
                if(w2.indexOf(w1.charAt(i))==-1||w1.compareTo(w2)==0){
                    f=0;
                    break;
                }
            }
        if(f==1)
        System.out.println(w1+" and "+w2+" is an anagram");
        else
        System.out.println(w1+" and "+w2+" is not an anagram");
        }
        System.out.println("Wrong Input!!");
    }
}
