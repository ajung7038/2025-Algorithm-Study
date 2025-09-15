import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class boj_11055 {
	public static void main(String[] args) throws IOException {
		// boj_11055: 가장 큰 증가하는 부분 수열 
		// https://www.acmicpc.net/problem/11055
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		int[] arr = new int[n];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for (int i=0; i<n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		int[] dp = new int[n];
		dp[0] = arr[0];
		
		for(int i=1; i<n; i++) {
			if (n==1) break;
			int max = 0;
			for (int j=i-1; j>=0; j--) {
				if (arr[j] < arr[i] && max < dp[j]) max = dp[j]; 
			}
			
			dp[i] = max + arr[i];
		}
		
		Arrays.sort(dp);
		System.out.println(dp[n-1]);
	}
}
