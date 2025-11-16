import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Automobile[] autos = new Automobile[3]; //Автомобили - участники гонки
        // Переменные для информации об автомобиле
        double speed;
        String name = "";
        // Ввод
        for (short i = 0; i < 3; i++) {
            name = "";
            while (name.isEmpty()) {
                System.out.println("Введите название автомобиля " + (i + 1));
                name = in.nextLine(); //допускаем имя автомобиля с пробелами
            }
            speed = -1.0;
            while (!((speed >= 0) && (speed <= 250))) {
                System.out.println("Введите скорость автомобиля " + (i + 1));
                String speedStr = in.nextLine();
                try {
                    speed = Double.parseDouble(speedStr);
                } catch (Exception e) {
                    System.out.println("Неправильная скорость!");
                    continue;
                }
                if (!((speed >= 0) && (speed <= 250))) {
                    System.out.println("Неправильная скорость!");
                }
            }
            Automobile auto = new Automobile(name, speed);
            autos[i] = auto;
        }
        System.out.println("Ввод успешно завершён!");
        Gonka гонка = new Gonka(autos);
        Automobile лидер = гонка.startAndGetLeader(24);
        System.out.println("Самая быстрая машина: " + лидер.name);
    }
}