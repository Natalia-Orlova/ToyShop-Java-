package ToyShop;

import java.util.ArrayList;
import java.util.List;

public class ToyShop {
    private List<Toy> toys;
    private int totalToysSum = 10;

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
    public int drawToys(List<Toy> toys) {
        int res;
        double random = Math.floor(Math.random() * 100) + 1;
        if (random < 6) {
            res = toys.get(0).getId();
        } else if (random < 16) {
            res = toys.get(1).getId();
        } else if (random < 31) {
            res = toys.get(2).getId();
        } else if (random < 61) {
            res = toys.get(3).getId();
        } else {
            res = toys.get(4).getId();
        }
        System.out.println("Поздравляем! Выпала игрушка: " + res);
        return res;
    }


    //выдача игрушки
    public void giveOutToy(ArrayList<Integer> giveAway, List<Toy> toys) {
        int id = giveAway.get(0)-1;
        giveAway.remove(0);
        totalToysSum = totalToysSum - 1; // меньшаем общее кол-во игрушек
        toys.get(id).setToyCount(toys.get(id).getToyCount() - 1); // уменьшаем кол-во каждого вида игрушек
        dw.writeToFile(toys.get(id));

        System.out.println("Игрушки для выдачи: " + giveAway);
        System.out.println("Остаток игрушек: " + totalToysSum);
    }

    public void addToy(Toy toy) {
        toys.add(toy);
        totalToysSum++;
    }

}
