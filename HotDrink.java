public class HotDrink extends Drink 
{
    private int temperature;
    public HotDrink(String name, double price, int volume, int temperature) 
    {
        super(name, price, volume);
        this.temperature=temperature;
    }

    public HotDrink()
    {

    }

    public int getTemperature() 
    {
       return temperature;
    }

    public void getAvailableDrinks()
    {
         System.out.println("Drink has-"+super.getName()+"-price-"+super.getPrice()
         +"-volume-"+super.getVolume()+"-temperature-"+this.getTemperature());
    }

}

