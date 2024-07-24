// Palindrome Checker:

package strings;

public class PalindromeChecker {
    public static boolean isPalindrome(String s) {
        s = s.toLowerCase(); // case doesn't matter in finding Palindrome
        int left = 0;
        int right = s.length() - 1;
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true; // if we reach here, the string is a palindrome
    }

    public static void main(String[] args) {
        String s = "MADAM";
        String s1 = "CIPHER";
        String s2 = "Madam";
        System.out.println(isPalindrome(s));
        System.out.println(isPalindrome(s1));
        System.out.println(isPalindrome(s2));
    }
}


//Anagram Checker:

package strings;

public class AnagramChecker {
    public static boolean areAnagrams(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false; // if lengths are not equal, they can't be anagrams
        }
        s1 = s1.toLowerCase(); // ignore case
        s2 = s2.toLowerCase(); // ignore case
        int n = s1.length();
        int[] freqArr1 = new int[26]; // frequency array for s1
        int[] freqArr2 = new int[26]; // frequency array for s2
        for (int i = 0; i < n; i++) {
            int index1 = s1.charAt(i) - 'a'; // map character to index (relative to 'a')
            freqArr1[index1]++;
            int index2 = s2.charAt(i) - 'a'; // map character to index (relative to 'a')
            freqArr2[index2]++;
        }
        for (int i = 0; i < 26; i++) {
            if (freqArr1[i] != freqArr2[i]) {
                return false; // if frequency arrays are not equal, they're not anagrams
            }
        }
        return true; // if we reach here, the strings are anagrams
    }

    public static void main(String[] args) {
        System.out.println(areAnagrams("CAT", "TAC"));
        System.out.println(areAnagrams("CAT", "TAG"));
        System.out.println(areAnagrams("CAT", "TACC"));
    }
}

