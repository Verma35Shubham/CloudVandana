package Java_Question;
import java.util.Scanner;

public class String_Pangram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your String: ");
        String str = sc.next();
        boolean boolean_Value = Check_Pangram(str);
        String ans = boolean_Value ? "Pangram" : "not Pangram";
        System.out.println("Your String is: " + ans);
        System.out.println();
        sc.close();
    }

    private static boolean Check_Pangram(String str) {
        str = str.toLowerCase();

        boolean[] arr = new boolean[26];
        for(char ch : str.toCharArray()){
            if(Character.isLetter(ch)){
                int idx = ch - 'a';
                arr[idx] = true;
            }
        }
        for(int i = 0; i<26; i++){
            if(!arr[i]){
                return false;
            }
        }
        return true;
    }
}
//Abcdefghijklmnopqrstuvwxyz
