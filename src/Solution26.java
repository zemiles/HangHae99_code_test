package hanghae99code;

public class Solution26 {
    public int solution(int n) {
        int answer = 0;

        for(int i = 1; i <= n; i++){
            if(n % i == 0){
                answer += i;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution26 st = new Solution26();
        System.out.println(st.solution(12));
    }
}
