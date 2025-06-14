import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj_10040 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String[] nm = br.readLine().split(" ");
    int n = Integer.parseInt(nm[0]);
    int m = Integer.parseInt(nm[1]);

    int[] cost = new int[n];
    for (int i = 0; i < n; i++) {
      cost[i] = Integer.parseInt(br.readLine());
    }

    int[] vote = new int[n];
    for (int i = 0; i < m; i++) {
      int b = Integer.parseInt(br.readLine());
      for (int j = 0; j < n; j++) {
        if (cost[j] <= b) {
          vote[j]++;
          break;
        }
      }
    }

    int max = 0;
    int result = 0;
    for (int i = 0; i < n; i++) {
      if (vote[i] > max) {
        max = vote[i];
        result = i;
      }
    }

    System.out.println(result + 1);

  }
}