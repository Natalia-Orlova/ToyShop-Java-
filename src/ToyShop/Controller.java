package ToyShop;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Controller {
    public static void buttonClick() {
        List<Toy> toyList = Arrays.asList(
                new Toy(1, "Lego", 10),
                new Toy(2, "Ball", 20),
                new Toy(3, "ToyGun", 30),
                new Toy(5, "HuggyWuggy", 60),
                new Toy(6, "KissyMissy", 80)
        );
        System.out.println(toyList);

        ToyShop ts = new ToyShop(toyList);
        ts.drawToys();

        try (Scanner in = new Scanner(System.in)) {

            while (true) {
                System.out.println("Выберите действие: \n");
                System.out.println("1 - Разыграть игрушку");
                System.out.println("2 - Выдать игрушку");
                System.out.println("0 - Выход \n");
                String key = in.next();
                System.out.print("\033[H\033[J");
                switch (key) {
                    case "1":
                        ts.drawToys();
                        break;
                    case "2":
                        // метод выдачи игрушки
                        break;
                    case "0":
                        System.exit(0);
                    default:
                        System.out.println("Такой команды нет");
                        break;
                }
            }
        }

    }


}
