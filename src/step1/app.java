package step1;

import java.util.Scanner;

public class app {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        while (true) {
            //첫번째 숫자 입력 받기
            System.out.println("첫번째 숫자를 입력해주세요 : ");
            int num1 = sc.nextInt();

            //두번째 숫자 입력 받기
            System.out.println("두번째 숫자를 입력해주세요 : ");
            int num2 = sc.nextInt();

            //사칙연산 기호 입력 받기
            System.out.println("사칙연산 기호를 입력해주세요 : ");
            char operator = sc.next().charAt(0);

            //연산기호 맞게 계산하고 result 저장
            int result = 0;


            switch (operator) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    if (num2 == 0) {
                        System.out.println("나눗셈 연산에서 분모가 0이 될수 없습니다.");
                        continue; // 처음으로 돌아가

                    }
                    else {
                        result = num1 / num2;
                    }
                    break;



            }

            //결과 출력하기
            System.out.println("결과는 " + result + " 입니다.");
            //종료 문자 안내
            System.out.println("계산기를 종료 하시겠습니까");
            //exit에 데이터 입력 받기
            String exit = sc.next();
            //exit가 "종료: 문자열과 같은지?
            if (exit.equals("exit")) {break;}
            else {
                System.out.println("계산기를 계속 실행합니다");
            }







        }
    }
}