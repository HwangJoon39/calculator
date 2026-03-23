package step2;

import java.util.Scanner;

public class app {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Calculator 객체 생성
        Calculator cal = new Calculator();

        while (true) {
            System.out.print("첫 번째 숫자를 입력해주세요: ");
            int num1 = sc.nextInt();

            System.out.print("두 번째 숫자를 입력해주세요: ");
            int num2 = sc.nextInt();

            System.out.print("사칙연산 기호를 입력해주세요: ");
            char operator = sc.next().charAt(0);

            //result 변수에 저장
            int result = cal.calculate(num1, num2, operator);
            //Getter 열어준걸 가져올수있게
            System.out.println("현재까지의 계산 기록: " + cal.getResults());
            //만약 Setter 열어준걸 사용할때
            //cal.setResults(new ArrayList<>());
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