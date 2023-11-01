public class Fruit {
    String name;
    double price;
    public Fruit(String name, double price) {
        this.name = name;
        this.price = price;
    }
    public void print() {
        System.out.printf("%s sells at %f.\n", name, price);
    }
    public static void main(String[] args) {
        Fruit apple = new Fruit("Durian", 188.00);
        apple.print();
    }
}
