class Solution {
    String ans = "";
    public String greatestLetter(String s) {
        
        ArrayList<Character> upperCaseList = new ArrayList<Character>();
        ArrayList<Character> lowerCaseList = new ArrayList<Character>();
        
        char[] arr = s.toCharArray();
        Arrays.sort(arr); // Sort char array in ascending order
        
        for(char ch : arr) {
            if(Character.isUpperCase(ch)){
                upperCaseList.add(ch);
            } // spliting the char array to two lists  of Uppercase and Lowercase list
                else {
                    lowerCaseList.add(ch);
                }
        }
        
        for(int i=upperCaseList.size() - 1; i >= 0; i--) { // greddy approach to travese from back side of the list
            char x = upperCaseList.get(i);
            char y = Character.toLowerCase(x);
            if(charBinarySearch(lowerCaseList, y)) {// searching using binary search for optimization
                ans = Character.toString(x);
                return ans;
                }
            }
        return ans;
        }

    public boolean charBinarySearch(ArrayList<Character> al, char ch) { 
        int l = 0;
        int r = al.size() - 1;
        while(l <= r) {
            int m = (l + r) / 2;
            if(al.get(m) == ch) {
                return true;
            }
            else if(al.get(m) < ch) {
                l = m + 1;
            }
            else if(al.get(m) > ch) {
                r = m - 1;
            }
        }
        return false;
    }
}

/* 2nd approach Using HashSet
class Solution
{
    public String greatestLetter(String s)
    {
        Set<Character> set = new HashSet<>();
        for(char ch : s.toCharArray())
            set.add(ch);
        
        for(char ch = 'z'; ch >= 'a'; ch--)
            if(set.contains(ch) && set.contains((char)('A'+(ch-'a'))))
               return ""+(char)('A'+(ch-'a'));
        return "";
    }
}
*/

/* 3rd approach using Counting sort in O(n) time complexity
class Solution
{
    public String greatestLetter(String s) {
        int[] up = new int[26];
        int[] low = new int[26];
        String ans="";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)>='A' && s.charAt(i)<='Z'){
                up[s.charAt(i)-'A']=1;
            }else{
                low[s.charAt(i)-'a']=1;
            }
        }
        for(int i=25;i>=0;i--){
            if(up[i]>0 && low[i]>0){
                ans += (char)(i+'A');
                break;
            }
        }
        return ans;
    }
}
*/