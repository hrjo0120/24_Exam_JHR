package org.koreait;

import java.util.Scanner;

//문제 1.가로길이, 세로길이를 입력받아 사각형 넓이 만큼
//       별을 찍어내는 프로그램을 구현합니다
 public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int width = scanner.nextInt();
        int height = scanner.nextInt();

        for (int j = 1; j <= height; j++) {
            for (int i = 1; i <= width; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}