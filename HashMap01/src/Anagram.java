import java.util.Arrays;

public class Anagram {
    // Method 1: Using Sorting
    static boolean isAnagramSort(String s1, String s2) {
        if (s1.length() != s2.length()) return false;

        char[] arr1 = s1.toCharArray();
        char[] arr2 = s2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);

        return Arrays.equals(arr1, arr2);
    }

    // Method 2: Using Frequency Count (Efficient)
    static boolean isAnagramCount(String s1, String s2) {
        if (s1.length() != s2.length()) return false;

        int[] count = new int[26]; // assuming lowercase a-z

        for (int i = 0; i < s1.length(); i++) {
            count[s1.charAt(i) - 'a']++;
            count[s2.charAt(i) - 'a']--;
        }

        for (int c : count) {
            if (c != 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";

        System.out.println("Using Sorting: " + isAnagramSort(str1, str2));
        System.out.println("Using Count: " + isAnagramCount(str1, str2));
    }
}

