import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

// https://www.acmicpc.net/problem/1676

public class boj_1676 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int num = Integer.parseInt(br.readLine());
		int count = 0;
 
		while (num >= 5) {
			count += num / 5;
			num /= 5;
		}
		System.out.println(count);
	}
}
