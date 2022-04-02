class Solution {
    public boolean isPalindrome(int x) {
        int n2=0, y=x;
        if(x<0){
            return false;
        }
        else {
            while(y != 0) {
                int n1 = y%10;
                n2 = n2*10 + n1;
                y = y/10;
            }
            if(n2 == x) {
                return true;
            }
            return false;
        }
    }
}