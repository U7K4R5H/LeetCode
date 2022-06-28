/* HashMap nlogn N
class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> res = new ArrayList<Integer>();
        Map<Integer, Integer> hm = new HashMap<Integer, Integer>();
        for(int num : nums) {
            hm.put(arr[i], mp.getOrDefault(arr[i], 0) + 1);
            if( (hm.get(num) > nums.length / 3) && (!res.contains(num)) ) {
                res.add(num);
            }
        }
        return res;
    }
} */

class Solution {
    public List<Integer> majorityElement(int[] nums) {
        
        List<Integer> ans = new ArrayList<Integer>();
        
        int num1 = Integer.MAX_VALUE, num2 = Integer.MIN_VALUE, count1 = 0, count2 = 0, len = nums.length;
        
        for(int num : nums) {
            
            if(num == num1){
                count1++;
            }
            else if(num == num2) {
                count2++;
            }
            else if(count1 == 0) {
                num1 = num;
                count1 = 1;
            }
            else if(count2 == 0) {
                num2 = num;
                count2 = 1;
            }
            else {
                count1--;
                count2--;
            }
        }
        
        count1 = 0;
        count2 = 0;
        
        for(int num : nums) {
            if(num == num1) {
                count1++;
            }
            if(num == num2) {
                count2++;
            }
        }
        
        if(count1 > len / 3) {
            ans.add(num1);
        }
        if(count2 > len / 3) {
            ans.add(num2);
        }
        
        return ans;
    }
}