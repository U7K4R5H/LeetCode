class Solution {
    //Binary Search
    private int lower_bound(String[] products, int start, String word) {
        int i = start, j = products.length, mid;
        while(i < j) {
            mid = (i + j) / 2;
            if(products[mid].compareTo(word) >= 0) {
                j = mid;
            }
            else {
                i = mid + 1;
            }
        }
        return i;
    }
    public List<List<String>> suggestedProducts(String[] products, String searchWord) {
        Arrays.sort(products);
        
        List<List<String>> result = new ArrayList<>();
        
        List<String> pl;
        
        // Get the starting index of word starting with `prefix`.
        int start = 0, bsStart = 0, n = products.length;
        
        String prefix = new String();
        
        for(char c : searchWord.toCharArray()) {
            prefix += c;
            
            start = lower_bound(products, bsStart, prefix);
            
             pl = new ArrayList<>(); //initalize new list to store cureent prefix result
            
            
            // Add the words with the same prefix to the result.
            // Loop runs until `i` reaches the end of input or 3 times or till the
            // prefix is same for `products[i]` Whichever comes first.
            for(int i=start; i < Math.min(start + 3, n); i++) {
                if(products[i].length() < prefix.length() || !products[i].substring(0, prefix.length()).equals(prefix))
                    break; // conditions that dont satisfy according to the question
                
                pl.add(products[i]);
                
            }
            
            result.add(pl);
            
            bsStart = Math.abs(start);
        }
        return result;
    }
}