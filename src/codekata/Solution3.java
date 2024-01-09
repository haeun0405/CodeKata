package codekata;

class Solution3 {
    // 숫자 비교하기
//    public int solution(int num1, int num2) {
//        boolean val = (0<=num1 && num1<=10000 && 0<=num2 && num2 <=10000);
//        int answer = 0;
//
//        if(val){
//            answer=(num1==num2)? 1: -1;
//        }
//        return answer;
//    }

    // 두 수의 합
//    static class Solution {
//        public int solution(int num1, int num2) {
//            int answer = num1 + num2;
//            return answer;
//        }
//    }
    // 두 수의 나눗셈
    static class Solution {
        public int solution(int num1, int num2) {
            double result = (double) num1 / (double) num2;
            return (int) (result * 1000);
        }
    }
}

