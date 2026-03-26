package step3;

import java.util.ArrayList;
import java.util.List;

public class ArithmeticCalculator<T extends Number> {

    // 컬렉션 상자
    private List<Double> results = new ArrayList<>();

    public List<Double> getResults() { return results; }
    public void setResults(List<Double> results) { this.results = results; }
    public void removeResult() {
        if (!results.isEmpty()) { results.remove(0); }
    }

    // 매개변수는 T로 받고, 나가는 결과는 Double로 반환
    public Double calculate(T num1, T num2, OperatorType operator) {
        double result = 0.0;

        // T 타입의 값을 안전하게 double로 꺼내와서 계산합니다.
        switch (operator) {
            case PLUS:
                result = num1.doubleValue() + num2.doubleValue();
                break;
            case MINUS:
                result = num1.doubleValue() - num2.doubleValue();
                break;
            case MULTIPLY:
                result = num1.doubleValue() * num2.doubleValue();
                break;
            case DIVIDE:
                if ( num2.doubleValue() == 0.0 ) {
                    System.out.println("나눗셈 연산에서 분모가 0이 될 수 없습니다.");
                } else {
                    result = num1.doubleValue() / num2.doubleValue();
                }
                break;
        }

        results.add(result);
        return result;
    }
}