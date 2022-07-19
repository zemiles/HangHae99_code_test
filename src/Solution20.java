import java.util.Arrays;
import java.util.Comparator;

public class Solution20 {
    public String solution(String s) {

        String[] str = new String[s.length()];

        for(int i = 0; i < str.length; i++){
            str[i] = s.substring(i, i+1);
        }

        Arrays.sort(str, Comparator.reverseOrder());

        String answer = "";

        for(String i : str){
            answer += i;
        }

        return answer;
    }

    public static void main(String[] args) {
        Solution20 st = new Solution20();
        String s = "Zbcdefg";

        System.out.printf(st.solution(s));
    }
}
