import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Logger logger = Logger.getLogger();
        logger.log("Программа запущена");
        logger.log("Просим пользователя ввести входные данные для списка");
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размер желаемого списка");
        int listSize = sc.nextInt();
        System.out.println("Введите максимальное значение");
        int numMaxLimit = sc.nextInt();

        logger.log("Создаем и наполняем список");

        List<Integer> newRandomList = RandomList.buildRandomList(listSize, numMaxLimit);
        System.out.println("Получен список случайных цифр: " + newRandomList);

        logger.log("Просим пользователя ввести входные данные для фильтрации");
        System.out.println("Введите порог для фильтра: ");
        int treshold = sc.nextInt();

        List<Integer> result = new Filter(treshold).filterOut(newRandomList);
        logger.log("Выводим результат на экран");
        System.out.println("Отфильтрованный список: " + result);

        logger.log("Завершаем программу\n");

        System.out.println("Показываем логи\n");
        logger.printLog(Logger.logList);
    }


}