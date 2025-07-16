import java.util.*;
public class SentenceArray {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a sentence");
        String s=sc.nextLine();
        StringTokenizer st=new StringTokenizer(s);
        String a[] = new String[st.countTokens()],t="";
        for(int i=0;i<a.length;i++)
        a[i]=st.nextToken();
        for(int i=0;i<a.length;i++){
            for(int j=0;j<a.length-1;j++){
                if(a[j].compareToIgnoreCase(a[j+1])<0){
                    t=a[j];
                    a[j]=a[j+1];
                    a[j+1]=t;
                }
            }
        }
        for(int i=0;i<a.length;i++)
        System.out.println(a[i]);
    }
}
