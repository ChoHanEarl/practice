package test;

class AB {
    public int compute(int num) {
        if(num<=1) return num; //오버라이딩 되어 AB의 compute메서드는 실행되지 않는다.
        return compute(num-1) + compute(num-2);
    }

}

class CD extends AB {
    public int compute (int num) {
        if(num <=1) return num;
        return compute(num-1)+compute(num-3);
    } // 3 +  [ 1 ] 오른쪽항 0
}// 2 +  0
// 1 - 1 = 0 왼쪽항은 0 결과 0 + 1 = 1
public class Main {
    public static void main(String[] args) {
        AB obj = new CD();  // 1. CD를 생성해 클래스 AB형으로 형변환 되어 뱐수 obj에 들어간다.
        System.out.println(obj.compute(4)); // 2. obj가 compute메서드를 실행한다. 매개변수는 4
    }
}

// 1 출력 결과를 쓰시오. 1
// 2 코드 흐름을 설명하시오
// 3 이 코드를 보고 떠오르는 자바의 키워드를 작어보세요 ,오버라이드, 다형성
