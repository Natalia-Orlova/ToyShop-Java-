package ToyShop;

import java.io.Serializable;
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

    public void addToy() {
        totalToysSum++;
    }

    public Serializable drawToys() {
        ArrayList<Integer> giveAway = new ArrayList<>();
        double random = Math.floor(Math.random() * 100) + 1;
        System.out.println(random);
        if (random < 6) {
            giveAway.add(1);
        } else if (random < 16) {
            giveAway.add(2);
        } else if (random < 31) {
            giveAway.add(3);
        } else if (random < 61) {
            giveAway.add(4);
        } else giveAway.add(5);
        System.out.println("Поздравляем! Ваша игрушка: " + giveAway.get(0));
        return giveAway;
    }


    public void giveOutToy(Toy toys) {
        totalToysSum = totalToysSum - 1;
        int toyCount = toys.getToyCount();
        toys.setToyCount(toyCount - 1);
    }
}
