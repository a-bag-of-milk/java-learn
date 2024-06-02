package learn.danya.chapter1;

import java.util.HashMap;

public class Test {
    public static void main(String[] args) {
        System.out.println(romanToInt("MCMXCIV"));
    }
    public static int romanToInt(String s) {
        int sum = 0;

        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);
        StringBuilder sb = new StringBuilder(s);
        sb.reverse();
        String str = sb.toString();

        char[] chars = s.toCharArray();
        for(int i = 0; i < chars.length; i++) {
            sum += map.get(chars[i]);
            if (map.containsKey(chars[i])) {
                if(chars[i] == 'I') {
                    if(chars[i+1] == 'V') {
                        sum += map.get(chars[i+1]) - map.get(chars[i]);
                        i++;
                    } else if(chars[i+1] == 'X') {
                        sum += map.get(chars[i+1]) - map.get(chars[i]);
                        i++;
                    }
                }
                if(chars[i] == 'X') {
                    if(chars[i+1] == 'L') {
                        sum += map.get(chars[i+1]) - map.get(chars[i]);
                        i++;
                    } else if(chars[i+1] == 'C') {
                        sum += map.get(chars[i+1]) - map.get(chars[i]);
                        i++;
                    }
                }
                if(chars[i] == 'C') {
                    if(chars[i+1] == 'D') {
                        sum += map.get(chars[i+1]) - map.get(chars[i]);
                        i++;
                    } else if(chars[i+1] == 'M') {
                        sum += map.get(chars[i+1]) - map.get(chars[i]);
                        i++;
                    }
                }
            }
        }
        return sum;
    }
}