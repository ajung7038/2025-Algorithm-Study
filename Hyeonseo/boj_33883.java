import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj_33883 {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    char[] vowels = {'a', 'e', 'o', 'u', 'i'};
    String target = br.readLine();
    StringBuffer sb = new StringBuffer(target);
    String r_target = sb.reverse().toString();

    char[] t = target.toCharArray();
    char last = t[t.length - 1];
    if (last == 'n' || last == 's') {
      findSecondVowel(r_target, vowels);
      System.exit(0);
    }

    for (char v : vowels) {
      if (last == v) {
        findSecondVowel(r_target, vowels);
        System.exit(0);
      }
    }

    findLastVowel(target, vowels);

  }

  public static void findSecondVowel(String target, char[] vowels) {
    int flag = 0;
    for (int i = 0; i < target.length(); i++) {
      char s = target.charAt(i);
      for (char c : vowels) {
        if (s == c) {
          flag++;
          if (flag == 2) {
            System.out.println(target.length() - i);
            return;
          }
        }
      }
    }
    System.out.println(-1);
  }

  public static void findLastVowel(String target, char[] vowels) {
    for (int i = target.length() - 1; i >= 0; i--) {
      char s = target.charAt(i);
      for (char c : vowels) {
        if (s == c) {
          System.out.println(i + 1);
          return;
        }
      }
    }
    System.out.println(-1);
  }
}
