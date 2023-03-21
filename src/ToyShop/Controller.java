package ToyShop;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Controller {
    public static void buttonClick() {
        List<Toy> toyList = Arrays.asList(
                new Toy(1, "Lego", 5),
                new Toy(2, "Ball", 10),
                new Toy(3, "ToyGun", 15),
                new Toy(4, "HuggyWuggy", 30),
                new Toy(5, "KissyMissy", 40)
        );
        System.out.println(toyList);

        ToyShop ts = new ToyShop(toyList);

        ArrayList<Integer> giveAway = new ArrayList<>();

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
                        giveAway.add(ts.drawToys(toyList));
                        System.out.println("Игрушки для выдачи: " + giveAway);
                       //нужно добавить ограничение, чтобы разыграть можно было не больше totalToysSum
                        break;
                    case "2":
                        try {
                            ts.giveOutToy(giveAway, toyList);
                        } catch (IndexOutOfBoundsException e) {
                            System.out.println("Игрушки для выдачи закончились или еще не разыграны!\n");
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
