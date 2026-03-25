package step3;

import java.util.ArrayList;
import java.util.List;

public class ArithmeticCalculator {

    // 컬렉션 상자
    private List<Integer> results = new ArrayList<>();

    public List<Integer> getResults() { return results; }
    public void setResults(List<Integer> results) { this.results = results; }
    public void removeResult() {
        if (!results.isEmpty()) { results.remove(0); }
    }

    // char 대신 OperatorType로 수정
    public int calculate(int num1, int num2, OperatorType operator) {
        int result = 0;

        // Enum에 적힌 이름을 기준으로 작성
        switch (operator) {
            case PLUS:
                result = num1 + num2;
                break;
            case MINUS:
                result = num1 - num2;
                break;
            case MULTIPLY:
                result = num1 * num2;
                break;
            case DIVIDE:
                if ( num2 == 0 ) {
                    System.out.println("나눗셈 연산에서 분모가 0이 될수 없습니다.");
                } else {
                    result = num1 / num2;
                }
                break;

        }

        results.add(result);
        return result;
    }
}