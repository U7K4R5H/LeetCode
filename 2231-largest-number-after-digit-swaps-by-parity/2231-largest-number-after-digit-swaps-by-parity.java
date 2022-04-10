class Solution {
    public int largestInteger(int num) {
        
        char[] chars = String.valueOf(num).toCharArray();
        
        ArrayList<Character> evenList = new ArrayList<Character>();
        ArrayList<Character> oddList = new ArrayList<Character>();
        
        for(int i=0; i<chars.length; i++) {
            if(chars[i] % 2 == 0) {
                evenList.add(chars[i]);
            }
            else {
                oddList.add(chars[i]);
            }
        }
        
        Collections.sort(evenList, Collections.reverseOrder());
        Collections.sort(oddList, Collections.reverseOrder());
        
        //Construction of the result
        
        int eIndex = 0, oddIndex = 0, res = 0;
        
        for(int i=0; i<chars.length; i++) {
            if(chars[i] % 2 == 0) {
                res *= 10;
                res += Character.getNumericValue(evenList.get(eIndex));
                eIndex++;
            }
            else {
                res *= 10;
                res += Integer.parseInt(String.valueOf(oddList.get(oddIndex)));
                oddIndex++;
            }
        }
        
        return res;
    }

}