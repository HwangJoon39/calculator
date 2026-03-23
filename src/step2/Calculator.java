package step2;

import java.util.ArrayList;
import java.util.List;

public class Calculator {

    // 컬렉션 상자
    private List<Integer> results = new ArrayList<>();

    //Getter 메서드
    public List<Integer> getResults() {
        return results;
    }
    //Setter 메서드
    public void setResults(List<Integer> results) {
        this.results = results;
    }

    //메서드
    public int calculate(int num1, int num2, char operator) {
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


                } else {
                    result = num1 / num2;
                }
                break;



        }
        //  계산된 결과값을 상자에 추가
        results.add(result);

        return result;
    }
    // 가장 먼저 저장된 계산 결과를 삭제하는 메서드
    public void removeResult() {
        if (!results.isEmpty()) {
            results.remove(0);
        }
    }
}

