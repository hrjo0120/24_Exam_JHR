package org.koreait;

//문제 3. 프로그램은 정수 10개의 피보나치 수열 숫자를 출력합니다.
//    수열을 생성하기 위해 루프를 사용합니다.
public class Main3 {
    public static void main(String[] args) {
        int n = 10;

        int sum = 0;
        int num1 = 0;
        int num2 = 1;

        for(int i = 1; i <=n; i++) {
            for(int j = i; j <= i; j++) {
                sum = sum + num1;
                num1 = num2;
                num2 = sum;
                System.out.print(sum + " ");
            }
        }
    }
}
