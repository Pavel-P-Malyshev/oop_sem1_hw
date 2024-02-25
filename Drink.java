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

    public Drink()
    {

    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getVolume() {
        return volume;
    }

    public void getAvailableDrinks() 
    {
        System.out.println("Your selection is: "+name+", price: "+price+", volume: "+ volume+" ml.,");

    }
}