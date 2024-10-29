import java.util.*;
public class overload_compare {
    void compare(int a,int b){
        if(a>b)
        System.out.println("Greater number: "+a);
        else
        System.out.println("Greater number: "+b);
    }
    void compare(char a,char b){
        if((int)a>(int)b)
        System.out.println("Greater character: "+a);
        else
        System.out.println("Greater character: "+b);
    }
    void  compare(String a,String b){
        if(a.length()>b.length())
        System.out.println("Greater string: "+a);
        else
        System.out.println("Greater string: "+b);
    }
}
