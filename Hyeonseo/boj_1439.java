import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class boj_1439 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] s = br.readLine().toCharArray();

        int zeroCount = 0;
        int oneCount = 0;

        if (s[0] == '0') zeroCount++;
        else oneCount++;

        for (int i = 1; i < s.length; i++) {
            if (s[i] != s[i - 1]) {
                if(s[i] == '0') zeroCount++;
                else oneCount++;
            }
        }
        System.out.println(Math.min(zeroCount, oneCount));

    }
}

/*
0, 1로만 이루어진 문자열 S
S의 모든 숫자를 전부 같게 연속된 하나 이상의 숫자를 잡고 뒤집기 (1 -> 0, 0 -> 1)

다음 문자와 지금 문자가 다르면 지금 문자의 그룹을 1 증가시킴
문자열이 끝나면 그룹 수가 적은 수를 점점 뒤집게 됨
-> 0이나 1 중 그룹 수가 적은 수 출력하기
-> 그룹 나누기 : 이전 문자와 다른 경우
 */