// https://www.acmicpc.net/problem/2231

import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class boj_2231 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String strN = br.readLine();
		int NLength = strN.length();
		int N = Integer.parseInt(strN);
		int result = 0;
		 
		for(int i = (N - (NLength * 9)); i < N; i++) {
			int number = i;
			int sum = 0;
			while(number != 0) {
				sum += number % 10;
				number /= 10;
			}
			if(sum + i == N) {
				result = i;
				break;
			}	
		}
		System.out.println(result);
	}		 
}
