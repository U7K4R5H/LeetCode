class Solution {
    public String removeDuplicates(String s, int k) {
        //IDEA: Create 2 stacks one keeps track of chars second one tracks occurence
        //if last char in charStack == current char update intStac.push(intStack.peek() + 1) 
        //if they are not equal it means its not duplication so we add 1 to int stack maning it's the first occurence 
        Stack<Character> chars = new Stack();
        Stack<Integer> combo = new Stack();
        
        
        for(char c: s.toCharArray()){
            if(!chars.isEmpty() && chars.peek() == c)
                combo.push(combo.peek() + 1);
            else combo.push(1);
            
            chars.push(c);
            if(combo.peek() == k){
                for(int i=0;i<k;i++){
                    chars.pop();
                    combo.pop();
        }}}

        StringBuilder sb = new StringBuilder();
        while(!chars.isEmpty()) sb.append(chars.pop());
        return sb.reverse().toString();
    }
}