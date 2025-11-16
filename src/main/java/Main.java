import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Hello world!");
        Automobile[] autos = new Automobile[3]; //Автомобили - участники гонки
        // Переменные для информации об автомобиле
        double speed;
        String name = "";
        // Ввод
        for (short i = 0; i < 3; i++) {
            name = "";
            while (name.equals("")) {
                System.out.println("Введите название автомобиля " + i);
                name = in.nextLine(); //допускаем имя автомобиля с пробелами
            }
        }
    }
}