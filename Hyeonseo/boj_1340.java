import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/*
이번 해가 몇 퍼센트 지났는지 계산
월/일/시/분 -> 일 년 중의 분으로 계산
    - 워
연도 -> 윤년 등으로 파악해서 총 몇 분인지 계산
분/연도분 * 100 출력
 */

public class boj_1340 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] tokens = br.readLine().split(" ");

        String month = tokens[0];
        int day = Integer.parseInt(tokens[1].replace(",", ""));
        int year = Integer.parseInt(tokens[2]);

        String time[] = tokens[3].split(":");
        int hour = Integer.parseInt(time[0]);
        int min = Integer.parseInt(time[1]);

        // 윤년 판별
        int year_flag = 365;
        if (year % 4 == 0) {
            if (year % 100 != 0 || year % 400 == 0) {
               year_flag = 366; // 윤년인 경우
            }
        }

        // 월 -> 몇 번째 월인지 계산
        int month_flag = 0;
        String[] monthList = {"", "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        for (String m : monthList) {
            if (m.equals(month)) {
                month_flag = Arrays.asList(monthList).indexOf(m);
                break;
            }
        }

        int[] monthDays = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (year_flag == 366) {
            monthDays[2] = 29; // 윤년이면 2월이 29일
        }

        // 월의 일 수 계산
        int day_flag = 0;
        for (int i = 1; i < month_flag; i++) {
            day_flag += monthDays[i];
        }
        day_flag += day;

        int total_hour = (day_flag - 1) * 24 + hour;
        int total_min = total_hour * 60 + min;

        int one_year_min = year_flag * 24 * 60;
        double percent = (double) total_min / one_year_min * 100;

        System.out.printf("%.9f", percent);

    }
}

