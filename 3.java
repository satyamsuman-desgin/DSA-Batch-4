class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left = 0;
        int maxlength = 0;
        int n = s.length();
        HashSet <Character> set = new HashSet<>();
        for(int right = 0 ; right<n;right++){
            char ch = s.charAt(right);
            while(set.contains(ch)){
                set.remove(s.charAt(left));
                left++;
            }
            set.add(ch);
            maxlength = Math.max(maxlength,right-left+1);
        }
        return maxlength;
    }
}
