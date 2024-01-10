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
//    static class Solution {
//        public int solution(int num1, int num2) {
//            double result = (double) num1 / (double) num2;
//            return (int) (result * 1000);
//        }
//    }

    // 짝수의 합
//    static class Solution {
//        public int solution(int n) {
//            int answer = 0;
//            for (int i = 0; i <= n; i++){
//                if (i % 2 == 0){
//                    answer += i;
//                } else {
//
//                }
//            }
//            return answer;
//        }
//    }
    // 배열의 평균값
//    static class Solution {
//        public double solution(int[] numbers) {
//            double answer = 0;
//
//            int sum = 0;
//            for(int i: numbers){
//                sum+=i;
//            }
//            answer = sum/(double)numbers.length;
//            return answer;
//        }
//    }
    // 짝수와 홀수
//    public static class Solution {
//        public String solution(int num) {
//            // 2로 나누어 떨어지면 짝수, 그렇지 않으면 홀수
//            if (num % 2 == 0) {
//                return "Even";
//            } else {
//                return "Odd";
//            }
//        }
//
//        public static void main(String[] args) {
//            Solution sol = new Solution();
//
//            // 테스트
//            System.out.println(sol.solution(3)); // "Odd"
//            System.out.println(sol.solution(4)); // "Even"
//        }
//    }
    // 배열의 평균값
    public static class Solution {
        public double solution(int[] arr) {
            double sum = 0;

            // 배열의 모든 요소를 더하기
            for (int num : arr) {
                sum += num;
            }

            // 평균값 계산
            return sum / arr.length;
        }

        public static void main(String[] args) {
            Solution sol = new Solution();

            // 테스트
            System.out.println(sol.solution(new int[]{1, 2, 3, 4})); // 2.5
            System.out.println(sol.solution(new int[]{5, 5})); // 5.0
        }
    }
}


