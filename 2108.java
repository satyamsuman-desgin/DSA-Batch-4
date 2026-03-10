class Solution {
    public String firstPalindrome(String[] words) {
        for (String w : words) {
            int l = 0, r = w.length() - 1;
            boolean ok = true;
            while (l < r) {
                if (w.charAt(l) != w.charAt(r)) {
                    ok = false;
                    break;
                }
                l++;
                r--;
            }
            if (ok) return w;
        }
        return "";
    }
}
