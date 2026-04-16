import java.util.HashMap;

public class MostFrequentChar {
//    public char getMaxOccuringChar(String s) {
//        HashMap<Character,Integer> map = new HashMap();
//        for(int i=0;i<s.length();i++){
//            char ch = s.charAt(i);
//            if(map.containsKey(ch)){
//                int freq = map.get(ch);
//                map.put(ch,freq+1); // overwrite
//            }
//            else map.put(ch,1);
//        }
//        int maxFreq = 0;
//        for(char ch : map.keySet()){
//            int freq = map.get(ch);
//            if(freq>maxFreq) maxFreq = freq;
//        }
//        char ans = s.charAt(0);
//        for(char ch : map.keySet()){
//            int freq = map.get(ch);
//            if(freq==maxFreq && ch<ans){
//                ans = ch;
//            }
//        }
//        return ans;
//    }
//}
    // SAHI H UPER WALA PER CHAL NHI RAHA H

    public char getMaxOccuringChar(String s) {
        HashMap<Character, Integer> map = new HashMap<>();

        // Step 1: frequency count
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (map.containsKey(ch)) {
                map.put(ch, map.get(ch) + 1);
            } else {
                map.put(ch, 1);
            }
        }

        // Step 2: max frequency + answer ek saath
        int maxFreq = 0;
        char ans = ' ';

        for (char ch : map.keySet()) {
            int freq = map.get(ch);
            if (freq > maxFreq) {
                maxFreq = freq;
                ans = ch;          // ✅ save char with max freq
            } else if (freq == maxFreq && ch < ans) {
                ans = ch;          // ✅ tie mein smaller char lo
            }
        }

        return ans;
    }
}
