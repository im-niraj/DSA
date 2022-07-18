package com.niraj.dynamicProgramming;


//746. Min Cost Climbing Stairs [LeetCode]
public class Minimum_Cost_Climbing_Stairs {

	public static void main(String[] args) {
		int[] cost = {10,15,20};
		int n = cost.length;
		
		
		/*  Normal Recursion technique  */
//		int ans = Math.min(solve(cost,n-1), solve(cost,n-2));
//		System.out.println(ans);
		
		
		
		/*  Memoization technique  */
//		int dp[] = new int[n+1];
//		for(int i=0; i<=n; i++){
//            dp[i] = -1;
//        }
//		int ans = Math.min(solve2(cost,n-1, dp), solve2(cost,n-2, dp));
//		System.out.println(ans);
		
		
		/*  Tabulation technique  */
		System.out.println(solve3(cost,n));
		
	}
	
	
	//normal recursion
	public static int solve(int[] cost, int n) {
		if(n==0) return cost[0];
		if(n==1) return cost[1];
		
		return cost[n] + Math.min(solve(cost,n-1), solve(cost,n-2));
	}
	
	
	//memoizaiton
	public static int solve2(int[] cost, int n, int[] dp) {
		//BASE CASE
		if(n==0) return cost[0];
		if(n==1) return cost[1];
		
		//STEP 2
		if(dp[n] != -1) return dp[n];
		
		//STEP 1
		dp[n] = cost[n] + Math.min(solve2(cost,n-1, dp), solve2(cost,n-2, dp));
		return dp[n];
	}
	
	
	
	//Tabulation
	public static int solve3(int[] cost, int n) {
		
		//STEP1 : creation of dp array
		int[] dp = new int[n+1];
		
		//STEP2 : base case analysis
		dp[0] = cost[0];
		dp[1] = cost[1];
		
		//STEP2 : 
		for(int i=2; i<n; i++) {
			dp[i] = cost[i] + Math.min(dp[i-1], dp[i-2]);
		}
		
		return Math.min(dp[n-1], dp[n-2]);
	}

}
