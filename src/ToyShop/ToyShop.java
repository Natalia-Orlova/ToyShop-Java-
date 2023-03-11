package ToyShop;

import java.util.ArrayList;
import java.util.List;

public class ToyShop {
    private List<Toy> toyList;

    public ToyShop(List<Toy> toyList) {
        this.toyList = toyList;
    }

    public List<Toy> getToys() {
        List<Toy> copyToy = new ArrayList<>();
        for (Toy toy : toyList) {
            copyToy.add(toy);
        }
        return copyToy;
    }
}
