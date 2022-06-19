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