import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class boj_2441 {
	
	// boj_2441 : 별 찍기 - 4
	// https://www.acmicpc.net/problem/2441
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();
		
		for (int i=0; i<n; i++) {
			for (int j=0; j<i; j++) {
				sb.append(" ");
			}
			for (int k=n-i; k>0; k--) {
				sb.append("*");
			}
			sb.append("\n");
		}
		
		System.out.println(sb);
	}
}
