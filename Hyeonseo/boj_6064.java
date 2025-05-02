import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class boj_6064 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; i++) {
            String[] tokens = br.readLine().split(" ");
            int m = Integer.parseInt(tokens[0]);
            int n = Integer.parseInt(tokens[1]);
            int x = Integer.parseInt(tokens[2]);
            int y = Integer.parseInt(tokens[3]);

            System.out.println(calculateK(m, n, x, y));
        }
    }

    static int calculateK(int m, int n, int x, int y) {
        int lcm = lcm(m, n); // 최소공배수

        int targetX = (x == m) ? 0 : x;
        int targetY = (y == n) ? 0 : y;

        for (int k = x; k <= lcm; k += m) {
            if (k % n == targetY) {
                return k;
            }
        }
        return -1;
    }

    static int gcd(int a, int b) {
        while (b != 0) {
            int tmp = a % b;
            a = b;
            b = tmp;
        }
        return a;
    }

    static int lcm(int a, int b) {
        return a * b / gcd(a, b);
    }
}
