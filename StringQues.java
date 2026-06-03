public class StringQues {

    static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        StringBuilder tb = new StringBuilder(t);
        for (int i = 0; i < s.length(); i++) {
            boolean ans = false;
            for (int j = 0; j < tb.length(); j++) {
                if (s.charAt(i) == tb.charAt(j)) {
                    ans = true;
                    tb.deleteCharAt(j);
                    break;
                }
            }
            if (!ans) {
                return false;
            }

        }
        return true;

    }

    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagarzm";
        System.out.println(isAnagram(s, t));
    }
}
