package ToyShop;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Controller {
    public static int totalToysSum = 10;
    public static void buttonClick() {
        List<Toy> toyList = Arrays.asList(
                new Toy(1, "Lego", 1),
                new Toy(2, "Ball", 2),
                new Toy(3, "ToyGun", 3),
                new Toy(4, "HuggyWuggy", 6),
                new Toy(5, "KissyMissy", 8)
        );
        System.out.println(toyList);

        ToyShop ts = new ToyShop(toyList);

        ArrayList<Integer> giveAway = new ArrayList<>(totalToysSum);

        try (Scanner in = new Scanner(System.in)) {

            while (true) {
                System.out.println("Выберите действие: \n");
                System.out.println("1 - Разыграть игрушки");
                System.out.println("2 - Выдать игрушку");
                System.out.println("0 - Выход \n");
                String key = in.next();
                System.out.print("\033[H\033[J");
                switch (key) {
                    case "1":
                        try {
                            giveAway.add(ts.drawToys(toyList));
                            System.out.println("Игрушки для выдачи: " + giveAway);
                        }
                        catch (IndexOutOfBoundsException e) {
                            System.out.println("Все игрушки разыграны!");
                        }
                        break;
                    case "2":
                        try {
                            ts.giveOutToy(giveAway, toyList);
                        } catch (IndexOutOfBoundsException e) {
                            System.out.println("Игрушки для выдачи закончились или еще не разыграны!");
                        }
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
