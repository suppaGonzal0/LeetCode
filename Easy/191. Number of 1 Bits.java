//Write a function that takes the binary representation of an unsigned integer and returns the number of '1' bits it has (also known as the Hamming weight).

public class Solution {
    public int hammingWeight(int n) {
        return Integer.bitCount(n);
    }
}