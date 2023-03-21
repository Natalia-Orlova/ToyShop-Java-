package ToyShop;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class DataWriter {

    public static void writeToFile(Toy toy) {
        try (FileWriter writer = new FileWriter("РазыгранныеИгрушки.txt", true)) {
            writer.write(toy.toFileString());
            writer.write("\n");
            writer.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
