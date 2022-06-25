/* Brute Force approach
class Solution {
    public int countAsterisks(String s) {
        List<Integer> ls = new ArrayList<>();
        for(int i=0; i<s.length(); i++) {
            char ch = s.charAt(i);
            if(ch == '|')
                ls.add(i);
        }
        
        if(ls.size() == 0) {
            return count(s, 0, s.length() - 1);
        }
        
        int l = 1, r = 2, ans = 0, fo = ls.get(0), lo = ls.get(ls.size() - 1);
        
        ans = count(s, 0, fo - 1) + count(s, lo + 1, s.length() - 1);
        
        while(l < ls.size() && r < ls.size()) {
            ans += count(s, ls.get(l) + 1, ls.get(r) - 1);
            l += 2;
            r += 2;
        }
        return ans;
    }
    public int count(String s, int l, int r) {
        int count = 0;
        for(int i=l; i<=r; i++) {
            char ch = s.charAt(i);
            if(ch == '*')
                count++;
        }
        return count;
    }
} 
TC:- O(N^2)
SC:- Q(N)

Optimized Solution Below
*/

// class Solution {
//     /** Algorithm:
//      *  1. Iterate over each character of string and keep a state boolean to determine if you're in a pair or outside pair
//      *  2. If current char is asterisk and outside pair, then increment the general counter
//      */
//     public int countAsterisks(String s) {
//         boolean pairMode = false;
//         int asterisks = 0;
//         for (char c : s.toCharArray()) {
//             if (c == '|') {
//                 pairMode = !pairMode;
//             } else if (c == '*') {
//                 asterisks += (pairMode ? 0 : 1);
//             }
//         }
//         return asterisks;
//     }
// }


 //Ultra Pro MAx Solution
class Solution {
    public int countAsterisks(String s) {
        int res = 0, bars = 0;
        for (int i = 0; i < s.length(); ++i) {
            if (s.charAt(i) == '*' && bars % 2 == 0)
                res++;
            if (s.charAt(i) == '|')
                bars++;
        }
        return res;
    }
}
    

