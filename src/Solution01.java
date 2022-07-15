public class Solution01 {
    public static void main(String[] args) {
        int a = 5;
        int b = 24;
        String[] day = {"FRI", "SAT", "SUN", "MON", "TUE", "WED", "THU"};
        int[] date = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int sum = 0;

        for (int i = 0; i < a - 1; i++) {
            sum += date[i];
        }
        sum += b - 1;

        String answer = day[sum % 7];
        System.out.println(answer);
    }
}
