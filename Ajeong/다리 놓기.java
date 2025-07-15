import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

// boj_1010 : https://www.acmicpc.net/problem/1010
// 정리본 : https://ajung7038.github.io/boj/BOJ-%EB%8B%A4%EB%A6%AC-%EB%86%93%EA%B8%B0/
public class boj_1010 {
	private static int[][] dp = new int[30][30];
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		int T = Integer.parseInt(br.readLine());
		
		for (int i=0; i<T; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken());
			int m = Integer.parseInt(st.nextToken());
			sb.append(DP(m, n)).append("\n");
		}
		
		System.out.println(sb);
	}
	
	private static int DP(int m, int n) {
		if (dp[m][n] > 0) return dp[m][n];
		
		if (n==m || n==0) return dp[m][n] = 1;
		
		return dp[m][n] = DP(m-1, n-1) + DP(m-1, n);
	}
}
