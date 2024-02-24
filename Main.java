

public class Main {
    public static void main(String[] args) 
    {
        
        HotDrink[] hot= {
            
        new HotDrink("Cappuchino", 2.24, 400, 80),
        new HotDrink("Latte", 2.9, 350, 80),
        new HotDrink("Green tea", 1, 400, 90)

        };

       

        Drink[] cold={
        new Drink("Cola", 0.75, 500),
        new Drink("Burn", 1.25, 330),
        new Drink("Sprite", 0.9, 330)
        };
        
        HotDrinkMachine Avtomat1=new HotDrinkMachine();
        Avtomat1.InitDrinks(hot);
        Avtomat1.InitDrinks(cold);
        Avtomat1.getAvailableDrinks("cold","Cola", 500, 0);
        Avtomat1.getAvailableDrinks("HOT","Latte", 350, 80);
        Avtomat1.getAvailableDrinks("hot","Green tea", 400, 90);
        Avtomat1.getAvailableDrinks("Cold","red wine", 400, 90);
        Avtomat1.getAvailableDrinks("hot","Smirnoff", 1000, 40);


        // // Используем полиморфизм для вызова методов makeSound и eat
        // for (Drink d : onDisplay) {
        //     an.makeSound(); // Вызываем метод makeSound для каждого объекта
        //     an.eat();       // Вызываем метод eat для каждого объекта
        //     System.out.println(); // Для отделения вывода информации о разных животных
        // }
    }
}
