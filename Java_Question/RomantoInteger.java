package Java_Question;

import java.util.HashMap;
import java.util.Scanner;

public class RomantoInteger {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Your Roman Value: ");
        String str = sc.next();
        
        int int_Value = romanToInteger(str);
        System.out.println("Your Integer Value For Given Roman Value: " + int_Value);
        System.out.println();
        sc.close();
    }

    private static int romanToInteger(String str) {
        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        
        int ans = 0;
        int prev = 0;
        for(int i = 0; i<str.length(); i++){
            int num = map.get(str.charAt(i));
            ans += num;
            if(prev != 0 && prev < num){
                ans -= 2*prev;
            }
            prev = num;
        }
        
        return ans;
    }
}
