package test;

public class Test01 {

    static public void main(String[] args) {

        int num = 10;
        for (int i = 1; i <= num; i++) { // 1. num의 수 만큼 열을 반복합니다.

            for (int j = i; j <= num; j++) { // 2 - 1. 열의 값 부터 시작하는 for문. num의 수가 될때까지 반복
                System.out.print(j+" ");
            }

            for (int k = 1; k < i; k++) { // // 2 - 2. 부족한 수를 채우는 for문
                System.out.print(k + " ");
            }
            System.out.println();
        }
    }
}
