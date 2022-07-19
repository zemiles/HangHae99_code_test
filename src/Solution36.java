public class Solution36 {

    public String solution(int[] numbers, String hand) {
        String answer = "";
        // 키패드에 번호를 부여 1,2,3,...,10(*),11(0),12(#)
        int left =10; // 왼손의 현위치
        int right =12; // 오른손의 현위치

        for(int tmp: numbers){
            // 1, 4, 7은 무조건 왼손이 누르기에 answer에 L 더해주고
            if(tmp==1||tmp==4||tmp==7){
                answer+="L";
                left = tmp; // tmp=현재 지점. 왼손의 현위치를 바꿔준다.
            // 3, 6, 9 역시 마찬가지로 answer에 R을 더해준다.
            }else if(tmp==3||tmp==6||tmp==9){
                answer+="R";
                right = tmp; // 오른손의 현위치도 바꿔준다.
            }else {
                if(tmp==0) tmp=11; // tmp가 영이면 11로 값을 강제로 할당해준다. 0번 위치가 11번째로 가정했기 때문

                // 다음 누를 버른이 2,5,8,0일 경우 왼손과 오른손중 어느 손이 더 가까운지 판별하기 위해 왼손의 거리와 오른손의 거리를 구해 비교한다.
                int leftdist = Math.abs(tmp-left) / 3 + Math.abs(tmp-left) % 3;
                // Math.abs(a): a의 절대값을 구하는 함수
                int rightdist = Math.abs(tmp-right) / 3 + Math.abs(tmp-right) % 3;

                if(leftdist<rightdist){ // 왼손이 더 가까우면
                    answer+="L";
                    left = tmp;
                }else if(leftdist>rightdist){ // 오른손이 더 가까우면
                    answer+="R";
                    right = tmp;
                }else{ // 둘의 거리가 같으면
                    if(hand.equals("left")){ // 입력받은 hand값에 따라 L 또는 R answer에 추가
                        answer+="L";
                        left = tmp;
                    }else{
                        answer+="R";
                        right = tmp;
                    }
                }
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Solution36 sol = new Solution36();
        int[] numbers = {1, 3, 4, 5, 8, 2, 1, 4, 5, 9, 5};
        String hand = "right";
        System.out.println(sol.solution(numbers, hand));
    }
}
