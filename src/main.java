public class Main {
    public static void main(String[] args) {
        CalculatorServiceImpl calculatorService = new CalculatorServiceImpl();
        System.out.println(calculatorService.sum(30,50));
        System.out.println(calculatorService.prod(35,15));
    }
}