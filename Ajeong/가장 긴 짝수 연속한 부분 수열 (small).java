import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class boj_22857 {
	public static void main(String[] args) throws IOException {
		// boj_22857: 가장 긴 짝수 연속한 부분 수열 (small)
		// https://www.acmicpc.net/problem/22857
    
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		int[] arr = new int[n];
		
		st = new StringTokenizer(br.readLine());
		for (int i=0; i<n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
	
		int even = 0;
		int odd = 0;
		int L = 0;
		int R = 0;
		int ans = 0;
		
		while (R < n) {
			if (arr[R]%2 == 0) {
				even++;
			} else odd++;
			
			while (odd > k) {
				if (arr[L]%2 == 0) {
					even--;
				} else odd--;
				L++;
			}
			
			ans = Math.max(ans, even);
			R++;

		}
		
		System.out.println(ans);
	}
}
