import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.StringTokenizer;

public class boj_11053 {
	// boj_11053 : 가장 긴 증가하는 부분 수열
	// https://www.acmicpc.net/problem/11053
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		int[] dp = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		for (int i=0; i<n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		dp[0] = 1;
				
		for (int i=1; i<n; i++) {
			int max = 0;
			for (int j=0; j<i; j++) {
				if (arr[j] < arr[i] && dp[j] > max) {
					max = dp[j];
				}
			}
			dp[i] = ++max;
		}
		
		Arrays.sort(dp);
		System.out.println(dp[n-1]);

	}
}
