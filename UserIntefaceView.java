package project;

import java.io.IOException;
import java.util.Scanner;


public class UserIntefaceView {
    private Controller controller = new Controller();

    public void runInterface() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Введите название города: ");
            String city = scanner.nextLine();

            System.out.println("Нажмите 1 для получения погоды на сегодня;" +
                    "Нажмите 5 для прогноза на 5 дней; Нажмите 2 для получения данных из базы; Для выхода нажмите 0:");

            String command = scanner.nextLine();



            if (command.equals("0")) break;

            try {
                controller.getWeather(command, city);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
