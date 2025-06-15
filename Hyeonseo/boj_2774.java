import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;

public class boj_2774 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int t = Integer.parseInt(br.readLine());
    for (int i = 0; i < t; i++) {
      String[] num = br.readLine().split("");
      HashSet<String> set = new HashSet<>(Arrays.asList(num));
      System.out.println(set.size());
    }
  }
}
