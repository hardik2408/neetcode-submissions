class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        
        Map<Character, Integer> count = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            count.put(s.charAt(i), count.getOrDefault(s.charAt(i), 0) + 1);
        }

        for (int i = 0; i < t.length(); i++) {
            if (count.get(t.charAt(i)) != null && count.get(t.charAt(i)) > 0) {
                System.out.println(t.charAt(i));
                count.put(t.charAt(i), count.get(t.charAt(i)) - 1);
            } else {
                return false;
            }
        }

        return true;
    }
}