package codekata;

import java.util.Arrays;
import java.util.Collections;

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
    // 평균 구하기
//    public static class Solution {
//        public double solution(int[] arr) {
//            double sum = 0;
//
//            // 배열의 모든 요소를 더하기
//            for (int num : arr) {
//                sum += num;
//            }
//
//            // 평균값 계산
//            return sum / arr.length;
//        }
//
//        public static void main(String[] args) {
//            Solution sol = new Solution();
//
//            // 테스트
//            System.out.println(sol.solution(new int[]{1, 2, 3, 4})); // 2.5
//            System.out.println(sol.solution(new int[]{5, 5})); // 5.0
//        }
//    }
    // 자릿수 더하기

//    public static class Solution {
//        public int solution(int n) {
//            int answer = 0;
//
//            while(true){
//                answer+=n%10;
//                if(n<10)
//                    break;
//
//                n=n/10;
//            }
//
//            System.out.println("Hello Java");
//
//            return answer;
//        }
//    }
    // 약수의 합
//public static class Solution {
//    public int solution(int n) {
//        int sum = 0;
//
//        // 1부터 n까지의 모든 숫자를 확인하여 약수를 찾는다.
//        for (int i = 1; i <= n; i++) {
//            if (n % i == 0) {
//                sum += i; // 약수를 찾으면 합에 추가
//            }
//        }
//
//        return sum;
//    }
//
//    public static void main(String[] args) {
//        Solution sol = new Solution();
//
//        // 테스트
//        System.out.println(sol.solution(12));
//        System.out.println(sol.solution(5));
//    }

    // 나머지가 1이 되는 수 찾기

//        public int solution3 (int n) {
//            int answer = 1;
//
//            while(n % answer != 1){
//                answer++;
//            }
//            return answer;
//        }

    // x만큼 간격이 있는 n개의 숫자
//    static class Solution {
//        public long[] solution(int x, int n) {
//            long[] answer = new long[n];
//            long sum = 0;
//            for(int i = 0;i<answer.length;i++){
//                sum += x;
//                answer[i] = sum;
//            }
//
//
//            return answer;
//        }
//    }
    // 자연수 뒤집어 배열로 만들기
//    static class Solution {
//        public int[] solution(long n) {
//            int length = Long.toString(n).length();
//            int[] answer = new int[length];
//
//            for (int i = 0; i < length; i++) {
//                answer[i] = (int) (n % 10);
//                n /= 10;
//            }
//
//            return answer;
//        }
//    }
    // 문자열을 정수로 바꾸기
//    static class Solution {
//        public int solution(String s) {
//            String answer = s;
//            return Integer.parseInt(answer);
//        }
//    }
    // 정수 제곱근 판별
//    static class Solution {
//        public long solution(long n) {
//            long answer = 0;
//
//            for (long i = 1; i <= n; i++) {
//                if (i * i == n) {
//                    answer = (i + 1) * (i + 1);
//                    break;
//                }
//                else answer = -1;
//            }
//            return answer;
//        }
//    }

    // 정수 내림차순으로 배치하기
    public static class Solution {
        public long solution(long n) {
            // 정수 n을 문자열로 변환
            String str = Long.toString(n);

            // 문자열을 문자 배열로 변환
            Character[] chars = new Character[str.length()];
            for (int i = 0; i < str.length(); i++) {
                chars[i] = str.charAt(i);
            }

            // 내림차순으로 정렬
            Arrays.sort(chars, Collections.reverseOrder());

            // 정렬된 문자 배열을 문자열로 다시 조합
            StringBuilder sb = new StringBuilder(chars.length);
            for (Character c : chars) {
                sb.append(c);
            }

            // 문자열을 정수로 변환하여 반환
            return Long.parseLong(sb.toString());
        }

    }

}


