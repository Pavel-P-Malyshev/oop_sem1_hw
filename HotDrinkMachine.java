
public class HotDrinkMachine extends HotDrink
{
    //private List<HotDrink> drinks;
    private HotDrink[] drinks;
    private Drink[] cdrinks;
    
    public HotDrinkMachine()
    {

    }
    
    
    public void InitDrinks(HotDrink[] drinks)
    {
       this.drinks=drinks;
    }

    public void InitDrinks(Drink[] drinks)
    {
       this.cdrinks=drinks;
    }

    public void getAvailableDrinks(String type,String name, int volume, int temperature)
    {
       if(type.equals("Cold") || type.equals("cold") || type.equals("COLD"))
       {
          this.getColdDrink(name, volume);
       }
       else if (type.equals("Hot") || type.equals("hot") || type.equals("HOT"))
       {
          this.getDrink(name, volume, temperature);
       }
       else
       {
        System.out.println("Select hot or cold drinks");
       }
    }

    
    public void getDrink(String name, int volume, int temperature) 
    {
        
        System.out.println("\n You can select from:");
        Boolean found=false;

        for (HotDrink hd : drinks) 
        {
                       
            if (hd.getName().equals(name) && hd.getVolume()==volume && hd.getTemperature()==temperature)
            {
                System.out.println("Drink: "+hd.getName()+", price: "+hd.getPrice()+"eu, volume: "+ hd.getVolume()+
                "ml., Current temperature: "+hd.getTemperature()+"'C");
                found=true;
            }
        }

        if(!found){
            System.out.println("Sorry. There are no drinks matching your request: "+name);
        }
            
        
        

    }

    public void getColdDrink(String name, int volume) 
    {
        
        System.out.println("\n You can select from:");
        Boolean found=false;

        for (Drink hd : cdrinks) 
        {
                       
            if (hd.getName().equals(name) && hd.getVolume()==volume)
            {
                System.out.println("Drink: "+hd.getName()+", price: "+hd.getPrice()+"eu, volume: "+ hd.getVolume()+
                "ml.");
                found=true;
            }
        }

        if(!found){
            System.out.println("Sorry. There are no drinks matching your request: "+name);
        }
            
        
        

    }


}
