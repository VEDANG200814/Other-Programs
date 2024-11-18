import java.util.*;
public class Consecutive_Vowels {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence");
        String  s = sc.nextLine().toUpperCase()+" ",v="AEIOU";
        int nc=0;
        System.out.println("Pair of vowels:");
        for(int i=0;i<s.length()-1;i++){
            if(v.indexOf(s.charAt(i))!=-1&&v.indexOf(s.charAt(i+1))!=-1){
                System.out.print(""+s.charAt(i)+s.charAt(i+1)+", ");
                nc++;
            }
        }
        System.out.println("\nNo. of pair of vowels: "+nc);
    }
}
