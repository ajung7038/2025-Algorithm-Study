import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class boj_25881 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine(), " ");
    int init = Integer.parseInt(st.nextToken());
    int plus = Integer.parseInt(st.nextToken());
    int n = Integer.parseInt(br.readLine());

    for (int i = 0; i < n; i++) {
      int use = Integer.parseInt(br.readLine());
      int money;

      if (use <= 1000) {
        money = use * init;
      } else {
        money = (init * 1000) + ((use - 1000) * plus);
      }

      System.out.println(use + " " + money);
    }
  }
}