package org.koreait;

import java.util.Scanner;

//문제 2. 양의 정수 n을 요청받아 숫자 패턴의 피라미드를 출력하는 프로그램
//        피라미드는 n 레벨을 가져야 하며,
//        최상위 레벨에서 n부터 시작하여 맨 아래층에서 1까지 숫자가 감소
public class Main2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for (int i = n; i > 0; i--) {
            for(int j = n-1; j >= i; j--) {
                System.out.print(" ");
            }
            for(int j = n; n >= j; j++) {
                System.out.print(i + " ");
            }
            System.out.println();
        }

    }
}
