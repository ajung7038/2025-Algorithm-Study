
import java.util.Scanner;

public class boj_11720 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = 0;
        int num = sc.nextInt();
        String s = sc.next();
        for (int i = 0; i < num; i++) {
            total += s.charAt(i) - '0';
        }
        System.out.println(total);
    }
}
