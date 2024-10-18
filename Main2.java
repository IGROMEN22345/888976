import java.util.Random;
import java.util.Scanner;

public class Main2 {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int targetNumber = random.nextInt(100) + 1;
        int guess = 0;
        int attempts = 0;
        System.out.println("Я загадав число від 1 до 100. Спробуйте його вгадати!");

        while (guess != targetNumber) {
            System.out.print("Ваше число: ");
            guess = scanner.nextInt();

            if (guess < targetNumber) {
                System.out.println("Загадане число більше.");
            } else if (guess > targetNumber) {
                System.out.println("Загадане число менше.");
            } else {
                System.out.println("Вітаю! Ви вгадали число.");
                System.out.println("Кількість спроб: " + attempts);
            }
        }
        scanner.close();
    }
}