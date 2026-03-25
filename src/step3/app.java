package step3;

import java.util.Scanner;

public class app {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Calculator 대신 ArithmeticCalculator를 가져온다
        ArithmeticCalculator cal = new ArithmeticCalculator();

        while (true) {
            System.out.print("첫 번째 숫자를 입력해주세요: ");
            int num1 = sc.nextInt();

            System.out.print("두 번째 숫자를 입력해주세요: ");
            int num2 = sc.nextInt();

            System.out.print("사칙연산 기호를 입력해주세요: ");
            //문자로 기호 받기
            char operatorChar = sc.next().charAt(0);

            //기호를 문자로 바꿔주기
            OperatorType operator = null;

            switch (operatorChar) {
                case '+':
                    operator = OperatorType.PLUS;
                    break;
                case '-':
                    operator = OperatorType.MINUS;
                    break;
                case '*':
                    operator = OperatorType.MULTIPLY;
                    break;
                case '/':
                    operator = OperatorType.DIVIDE;
                    break;
                default:
                    // 명단에 없는 이상한 기호를 입력하면 경고하고 처음으로 돌려보냅니다.
                    System.out.println("잘못된 기호입니다. 정확한 사칙연산 기호를 입력해주세요.");
                    continue;
            }

            //  다시 원래 calculator에 넘겨줌
            int result = cal.calculate(num1, num2, operator);


            System.out.println("현재까지의 계산 기록: " + cal.getResults());
            System.out.println("결과는 " + result + " 입니다.");

            // 삭제 메서드
            System.out.println("가장 먼저 저장된 데이터를 삭제하시겠습니까? (remove 입력 시 삭제, 아니면 아무 키나 입력)");
            String removeAnswer = sc.next();

            if (removeAnswer.equals("remove")) {
                cal.removeResult();
                System.out.println("삭제 후 연산 기록: " + cal.getResults());
            }

            System.out.println("계산기를 종료하시겠습니까? (exit 입력 시 종료)");
            String exit = sc.next();
            if (exit.equals("exit")) {
                System.out.println("계산기를 종료합니다.");
                break;
            } else {
                System.out.println("계산기를 계속 실행합니다.");
            }
        }
    }
}