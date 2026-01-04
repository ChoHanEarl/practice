public class Main {
    public static void main(String[] args) {
        int num1 = 30;
        int num2 = 15;

        CalPlus plus = new CalPlus();
        CalMinus minus = new CalMinus();

        System.out.println("Plus : " + plus.calculator(num1, num2));
        System.out.println("Minus : " + minus.calculator(num1, num2));
    }
}
