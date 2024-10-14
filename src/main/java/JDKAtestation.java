import java.util.Scanner;

public class JDKAtestation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String message;

        while (true) {
            System.out.print("Введите сообщение: ");
            message = scanner.nextLine();

            if (message.equalsIgnoreCase("exit")) {
                break;
            }

            System.out.println("Вы отправили сообщение: " + message);
        }

        scanner.close();
    }
}