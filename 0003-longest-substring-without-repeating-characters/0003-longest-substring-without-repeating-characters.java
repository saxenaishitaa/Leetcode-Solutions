import java.util.HashMap;

class Solution {
    public int lengthOfLongestSubstring(String s) {
        // Map to store the last seen index of each character
        HashMap<Character, Integer> map = new HashMap<>();
        
        int maxLength = 0;
        int left = 0; // Left pointer of the sliding window
        
        // Right pointer expands the window character by character
        for (int right = 0; right < s.length(); right++) {
            char currentChar = s.charAt(right);
            
            // If the character is already in the map and inside the current window
            if (map.containsKey(currentChar)) {
                // Move the left pointer to the right of the previous instance of currentChar
                left = Math.max(left, map.get(currentChar) + 1);
            }
            
            // Update or insert the character's latest position
            map.put(currentChar, right);
            
            // Calculate the window size and update max length
            maxLength = Math.max(maxLength, right - left + 1);
        }
        
        return maxLength;
    }
}