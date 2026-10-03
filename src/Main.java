import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Hero hero = new Hero("Artem", new Point(0, 0), new WalkStrategy());

        try (Scanner scanner = new Scanner(System.in)) {
            while (true) {
                System.out.println("\nТекущая позиция: " + hero.getCurrentPosition().getCoordinates());
                System.out.println("1: Двигаться к точке");
                System.out.println("2: Переключиться на шаг");
                System.out.println("3: Переключиться на машину");
                System.out.println("4: Переключиться на самолет");
                System.out.println("0: Выход");

                Integer choice = readInt(scanner, "Выберите действие: ");
                if (choice == null || choice == 0) {
                    return;
                }

                switch (choice) {
                    case 1:
                        Integer x = readInt(scanner, "Целевой X: ");
                        if (x == null) {
                            return;
                        }
                        Integer y = readInt(scanner, "Целевой Y: ");
                        if (y == null) {
                            return;
                        }
                        hero.move(new Point(x, y));
                        break;
                    case 2:
                        hero.setMoveStrategy(new WalkStrategy());
                        System.out.println("Выбрано: шаг");
                        break;
                    case 3:
                        hero.setMoveStrategy(new CarStrategy());
                        System.out.println("Выбрано: машина");
                        break;
                    case 4:
                        hero.setMoveStrategy(new PlaneStrategy());
                        System.out.println("Выбрано: самолет");
                        break;
                    default:
                        System.out.println("Выберите пункт с 0 по 4.");
                }
            }
        }
    }

    private static Integer readInt(Scanner scanner, String prompt) {
        while (true) {
            System.out.print(prompt);
            if (!scanner.hasNextLine()) {
                return null;
            }
            try {
                return Integer.parseInt(scanner.nextLine().trim());
            } catch (NumberFormatException e) {
                System.out.println("Введите целое число.");
            }
        }
    }
}
