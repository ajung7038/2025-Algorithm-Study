import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj_1978 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int count=0;
		
		for (int i=0; i<N; i++) {
			int num = Integer.parseInt(st.nextToken());
			boolean isPrime=true;
			if (num==1) isPrime=false;
			for (int j=2; j<num; j++) {
				if(num%j == 0) {
					isPrime = false;
					break;
				}
			}
			if(isPrime) {
				count++;
			}
		}
		
		System.out.println(count);
	}
}
