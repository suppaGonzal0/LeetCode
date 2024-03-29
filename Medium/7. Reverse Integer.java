/*
Given a signed 32-bit integer x, return x with its digits reversed. 
If reversing x causes the value to go outside the signed 32-bit integer range [-231, 231 - 1], then return 0.
Assume the environment does not allow you to store 64-bit integers (signed or unsigned).

Example 1:
Input: x = 123
Output: 321

Example 2:
Input: x = -123
Output: -321

Example 3:
Input: x = 120
Output: 21
*/

//Runtime: 2 ms & Memory: 39.9 MB

class Solution {
    public int reverse(int x) {
        long res = 0;

        while(x!=0){
            res = (res + x%10) * 10;
            x= x/10;
        }

        res = res/10;

        if(res > Integer.MAX_VALUE || res<Integer.MIN_VALUE) return 0;

        return (int)res;
    }
}
