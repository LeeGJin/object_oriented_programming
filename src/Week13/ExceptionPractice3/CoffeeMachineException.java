package Week13.ExceptionPractice3;

public class CoffeeMachineException {
    public static void main(String[] args) {
        CoffeeMachine coffee = new CoffeeMachine(15);

        try {
            coffee.brew();
            coffee.brew(); // 예외 발생
        }
        catch (NoCoffeeException e) {
            System.out.println(e.getMessage());
        }
    }
}
