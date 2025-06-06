// https://www.acmicpc.net/problem/1929

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj_1929 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int M = Integer.parseInt(st.nextToken());
		int N = Integer.parseInt(st.nextToken());
		
		// 에라스토테네스의 체 활용 
		boolean[] arr = new boolean[N+1];
		arr[0] = true; arr[1] = true;
		
		for (int i=2; i*i<arr.length; i++) {
			if (arr[i]) continue;
			for (int j=i*i; j<arr.length; j+=i) {
				arr[j] = true;
      }
		}
		StringBuilder sb = new StringBuilder();
		for (int i=M; i<N+1; i++) {
			if (!arr[i]) sb.append(i + "\n");
		}
		System.out.println(sb);
	}
}
