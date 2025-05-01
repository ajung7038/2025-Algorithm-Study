import java.util.*;

class Solution {
    TreeSet<Long> bannedSet = new TreeSet<>();
    long[] Grade = new long[12];
    long[] GradeSum = new long[12];

    public String solution(long n, String[] bans) {
        // Grade[i] = 26^i, GradeSum[i] = 누적합
        Grade[0] = 1;
        GradeSum[0] = 0;
        for (int i = 1; i <= 11; i++) {
            Grade[i] = Grade[i - 1] * 26;
            GradeSum[i] = GradeSum[i - 1] + Grade[i];
        }

        // 삭제된 문자열을 정수 인덱스로 환산해 TreeSet에 저장
        for (String ban : bans) {
            long index = toIndex(ban);
            bannedSet.add(index);
        }

        // 이진 탐색으로 n번째 유효 문자열 위치 찾기
        long left = 0, right = (long)1e18;
        long answerIndex = -1;

        while (left <= right) {
            long mid = (left + right) / 2;
            long bannedBefore = bannedSet.headSet(mid + 1).size();
            long validCount = mid - bannedBefore + 1;

            if (validCount >= n) {
                answerIndex = mid;
                right = mid - 1;
            } else {
                left = mid + 1;
            }
        }

        return toString(answerIndex);
    }

    // 문자열을 사전 순 인덱스로 변환
    private long toIndex(String s) {
        long idx = 0;
        for (int i = 0; i < s.length(); i++) {
            idx = idx * 26 + (s.charAt(i) - 'a');
        }
        return idx + GradeSum[s.length() - 1];
    }

    // 사전 순 인덱스를 문자열로 변환
    private String toString(long index) {
        int len = 1;
        while (index >= GradeSum[len]) len++;
        index -= GradeSum[len - 1];

        char[] chars = new char[len];
        for (int i = len - 1; i >= 0; i--) {
            chars[i] = (char)('a' + (int)(index % 26));
            index /= 26;
        }
        return new String(chars);
    }
}
