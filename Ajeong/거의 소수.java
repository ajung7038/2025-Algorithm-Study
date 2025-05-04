import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

class boj_1456_ans2 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        long A = Long.parseLong(st.nextToken());
        long B = Long.parseLong(st.nextToken());

        boolean[] X = new boolean[10000001];
        for(int i=2; i<Math.sqrt(X.length); i++){
            if(!X[i]) {
                for (int j = i + i; j < X.length; j += i) {
                    X[j] = true;
                }
            }
        }
        int answer = 0;
        for (int i = 2; i < X.length; i++) {
            if (!X[i]) {
                long now = i;
                while ((double)i <= (double) B / (double) now) {
                    if ((double) i >= (double) A / (double) now) {
                        answer++;
                    }
                    now *= i;
                }
            }
        }
        System.out.println(answer);
    }
}
