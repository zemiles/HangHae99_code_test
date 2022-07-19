public class Solution39 {
    public int solution(int n) {
        int answer = 0;

        for(int i=1; i<=n; i++) {
            int sum = 0;
            for(int j=i; j<=n; j++) {
                sum += j;

                if(sum==n) {
                    answer++;
                    break;
                } else if(sum>n) {
                    break;
                }
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        Solution39 sol = new Solution39();
        System.out.println(sol.solution(15));
    }
}
