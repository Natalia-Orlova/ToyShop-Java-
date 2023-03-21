package ToyShop;

import java.io.FileWriter;
import java.io.IOException;

public class DataWriter {
    //записываем в файл игрушки, которые уже разыграли и выдали победителям
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
