import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class boj_11727 {
	// boj_11727 : 2xn 타일링 2
	// https://www.acmicpc.net/problem/11727
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] dp = new int[n+1];
		dp[0] = dp[1] = 1;
		
		for (int i=2; i<n+1; i++) {
			dp[i] = (dp[i-1] + 2 * dp[i-2]) % 10007;
		}
		
		System.out.println(dp[n]);
	}

}
