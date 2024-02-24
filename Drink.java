public class Drink 
{
    private String name;
    private double price;
    private int volume;

    public Drink(String name, double price, int volume) {
        this.name = name;
        this.price = price;
        this.volume=volume;
    }

    // Методы для доступа к приватным полям
    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    // Общие методы для всех животных
    public int getVolume() {
        return volume;
    }

    public void getDrink() 
    {
        System.out.println("Your selection is: "+name+", price: "+price+", volume: "+ volume+" ml.,");

    }
}