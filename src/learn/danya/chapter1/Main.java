package learn.danya.chapter1;

import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        System.out.println(romanToInt("III"));
    }
    public static int romanToInt(String s) {
        int sum = 0;

        HashMap<Character, Integer> map = new HashMap<>();
        map.put('I', 1);
        map.put('V', 5);
        map.put('X', 10);
        map.put('L', 50);
        map.put('C', 100);
        map.put('D', 500);
        map.put('M', 1000);

        char[] chars = s.toCharArray();
        for(int i = 0; i < chars.length; i++) {}

        for (int i = 0; i < s.length(); i++) {
            //char c = s.charAt(i);
        }
        int i = 1;
        while(i < chars.length) {
            i++;
            char c = chars[i];
            if(map.containsKey(c)) {
                sum += map.get(c);
                if(c == 'I') {
                    char cc = s.charAt(++i);
                    if(cc == 'V') {
                        sum += map.get('V') - map.get('I');
                    }
                    if(cc == 'X') {
                        sum += map.get('X') - map.get('I');
                    }
                }
                if(c == 'X') {
                    char cc = s.charAt(++i);
                    if(cc == 'L') {
                        sum += map.get('L') - map.get('X');
                    }
                    if(cc == 'C') {
                        sum += map.get('C') - map.get('X');
                    }
                }
                if(c == 'C') {
                    char cc = s.charAt(i++);
                    if(cc == 'D') {
                        sum += map.get('D') - map.get('C');
                    }
                    if(cc == 'M') {
                        sum += map.get('M') - map.get('C');
                    }
                }
            }
        }
        return sum;
    }
}

