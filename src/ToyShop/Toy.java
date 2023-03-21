package ToyShop;

public class Toy {
    private int id;
    private String name;
    private int toyCount;
    private double frequency;

    private int totalToysSum = 100;

    public Toy(int id, String name, int count) {
        this.id = id;
        this.name = name;
        this.toyCount = count;
        this.frequency = count * 100 / totalToysSum;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getToyCount() {
        return toyCount;
    }

    public void setToyCount(int toyCount) {
        this.toyCount = toyCount;
    }

    public double getFrequency() {
        return frequency;
    }

    public void setFrequency(double frequency) {
        this.frequency = frequency;
    }

    public String toFileString() {
        return String.format("%d, %s", id, name);
    }

    @Override
    public String toString() {
        return "Toy: " +
                "id=" + id +
                ", name='" + name + '\'' +
                ", count=" + toyCount +
                ", frequency=" + frequency +
                '%'+ "\n";
    }
}
