import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;

public class boj_11286 {
    static PriorityQueue<Integer> minHeap = new PriorityQueue<>(
            (a, b) -> {
                int absA = Math.abs(a);
                int absB = Math.abs(b);
                if (absA == absB) return Integer.compare(a, b); // 절댓값이 같은 경우 음수 우선
                return Integer.compare(absA, absB); // 절댓값 기준 정렬
            }
    );

    static void addData(int x) {
        minHeap.add(x);
    }

    static int printData() {
        if (minHeap.isEmpty()) return 0;
        return minHeap.poll();

    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());
            if (n == 0) {
                System.out.println(printData());
            } else {
                addData(n);
            }
        }

    }
}
