package ToyShop;

import java.io.Serializable;
import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ToyShop {
    private List<Toy> toys;
    private int totalToysSum = 200;

    public ToyShop(List<Toy> toys) {
        this.toys = toys;
    }

    public List<Toy> getToys() {
        List<Toy> copyToy = new ArrayList<>();
        for (Toy toy : toys) {
            copyToy.add(toy);
        }
        return copyToy;
    }

    DataWriter dw = new DataWriter();
    // розыгрыш
    public ArrayList<String> drawToys(List<Toy> toys) {
        ArrayList<String> giveAway = new ArrayList<>();

        for (int i = 0; i < toys.size(); i++) { //
            double random = Math.floor(Math.random() * 100) + 1;
            if (random < 6) {
                giveAway.add(toys.get(0).getName());
                toys.get(0).setToyCount(toys.get(0).getToyCount() - 1); //уменьшаем количество каждого вида игрушки
            } else if (random < 16) {
                giveAway.add(toys.get(1).getName());
                toys.get(1).setToyCount(toys.get(1).getToyCount() - 1);
            } else if (random < 31) {
                giveAway.add(toys.get(2).getName());
                toys.get(2).setToyCount(toys.get(2).getToyCount() - 1);
            } else if (random < 61) {
                giveAway.add(toys.get(3).getName());
                toys.get(3).setToyCount(toys.get(3).getToyCount() - 1);
            } else {
                giveAway.add(toys.get(4).getName());
                toys.get(4).setToyCount(toys.get(4).getToyCount() - 1);
            }
            totalToysSum -= 1; //уменьшаем общее количество игрушек
        }

        System.out.println("Поздравляем! Выпали игрушки: " + giveAway);
        System.out.println("Остаток игрушек: " + totalToysSum);
        return giveAway;
    }
    public void giveOutToy(Toy toys) {
        totalToysSum = totalToysSum - 1;
        int toyCount = toys.getToyCount();
        toys.setToyCount(toyCount - 1);
    }

    public void addToy(Toy toy) {
        toys.add(toy);
        totalToysSum++;
    }

}
