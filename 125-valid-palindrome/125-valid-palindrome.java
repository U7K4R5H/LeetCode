class Solution {
  public boolean isPalindrome(String s) {
    s = s.toLowerCase();
    s = s.replaceAll("[^a-z0-9]", "");
      char ch[] = s.toCharArray();
    return checkPalindrome(ch, 0);
  }
    public boolean checkPalindrome(char[] ch, int i) {
        
        if(i >= ch.length/2) return true;
        
        if(ch[i] != ch[ch.length - 1 - i]) return false;
        
        return checkPalindrome(ch, i + 1);
    }
}