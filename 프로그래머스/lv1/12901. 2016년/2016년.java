import java.time.LocalDate;
import java.time.Year;

class Solution {
    public String solution(int a, int b) {
        LocalDate date = Year.of(2016).atMonth(a).atDay(b);
        String answer = String.valueOf(date.getDayOfWeek());


        return answer.substring(0, 3);
    }
}