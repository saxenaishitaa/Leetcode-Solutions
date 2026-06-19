class Solution {
    public String removeDuplicateLetters(String s) {
        
        int[] lastIndex = new int[26];
        for (int i = 0; i < s.length(); i++) {
            lastIndex[s.charAt(i) - 'a'] = i; 
        }
        
        boolean[] seen = new boolean[26];
        StringBuilder st = new StringBuilder();
        
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            
            if (seen[c - 'a']) {
                continue;
            }
            
            while (st.length() > 0 && 
                   c < st.charAt(st.length() - 1) && 
                   lastIndex[st.charAt(st.length() - 1) - 'a'] > i) {
                
                seen[st.charAt(st.length() - 1) - 'a'] = false;
                st.deleteCharAt(st.length() - 1);
            }
            
            st.append(c);
            seen[c - 'a'] = true;
        }
        
        return st.toString();
    }
}