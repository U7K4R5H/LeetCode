/*
𝑰𝒏𝒕𝒖𝒊𝒕𝒊𝒐𝒏: This is an observation-based problem you need to take
some examples and try out some examples.
​
𝑨𝒑𝒑𝒓𝒐𝒂𝒄𝒉:
1. Start traversing the array backward's from len-2 index and find
index of such an element whose value is smaller than it's right digit.
Let's call this index as left.
2. If the above index is -1(Array is already sorted) then reverse it.
this is an edge case.
3. Else again traverse the array backwords and find the index(right)
of an element which is greater then element at left index.
4. Swap the elements at left and right index positions.
5. Finally reverse the array from left + 1 index to the end.
​
𝑻𝒊𝒎𝒆 𝑪𝒐𝒎𝒑𝒍𝒆𝒙𝒊𝒕𝒚: This algorithm will take linear time and constant space.
*/https://youtu.be/LuLCLgMElus
https://youtu.be/6ENl3OwwxLg
https://practice.geeksforgeeks.org/problems/next-permutation5226/1
​
Check for this Example
Input: n = "534976"
Output: "536479"
search from right & since its a lexicographic order, so while moving from right to left we will observe a decending order of the elements
​
​