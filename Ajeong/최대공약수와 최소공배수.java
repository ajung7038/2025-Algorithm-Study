import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

// https://www.acmicpc.net/problem/2609

public class boj_2609 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int A = Integer.parseInt(st.nextToken());
		int B = Integer.parseInt(st.nextToken());
		
		int D = gcd(A, B);
		
		System.out.println(D);
		System.out.println(A*B/D);
	}
	
	public static int gcd(int a, int b) {
		while (b != 0) {
			int r=a%b;
			a=b;
			b=r;
		}
		return a;
	}
}
