import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class boj_2605 {

  public static void main(String[] args) throws IOException {
    LinkedList<Integer> students = new LinkedList<>();
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int N = Integer.parseInt(br.readLine());
    int[] order = new int[N];
    StringTokenizer st = new StringTokenizer(br.readLine(), " ");
    for (int i = 0; i < N; i++) {
      order[i] = Integer.parseInt(st.nextToken());
    }

    for (int i = 1; i <= N; i++) {
      int idx = students.size() - order[i - 1];
      students.add(idx, i);
    }

    for (int i = 0; i < N; i++) {
      System.out.print(students.get(i) + " ");
    }
  }
}