// https://leetcode.com/problems/richest-customer-wealth/
public class MaxWealth {
    public static void main(String[] args) {
        int[][] accounts = {{1,2,3},{3,2,1}};
        int max = maximumWealth(accounts);
        System.out.println("Max wealth: "+max);
    }
    public static int maximumWealth(int[][] accounts) {
        int ans = Integer.MIN_VALUE;
        for (int[] ints : accounts) {
            int sum = 0;
            for (int anInt : ints) {
                sum += anInt;
            }
            if (sum > ans) {
                ans = sum;
            }
        }
        return ans;
    }
}